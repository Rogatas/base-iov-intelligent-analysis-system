package report.lgd.service.impl;

import com.lgd.model.pojo.UserLoginInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.bvo.MailBvo;
import report.lgd.dao.MailDao;
import report.lgd.service.MailService;
import utils.endecrypt.XorUtils;
import utils.mail.MailUtils;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liguodong on 2016/4/10.
 */

@Service("mailService")
public class MailServiceImpl implements MailService{


    @Autowired
    MailDao mailDao;

    public void setMailDao(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public boolean isEmailExists(String email) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("email", email);

        boolean flag = mailDao.queryEmail(map)>0?true:false;

        return flag;
    }

    @Override
    public void sendMail(String email) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("email", email);
        List<UserLoginInformation> list = mailDao.queryPassword(map);
        UserLoginInformation user = list.get(0);


        if(user.getPassword()==null||user.getPassword().trim().equals("")||
                user.getEncryptPassword()==null ||
                user.getEncryptPassword().trim().equals("")){
            return;
        }

        //解密
        String decryptPassword =
                XorUtils.Decrypt(user.getEncryptPassword());

        MailBvo info = new MailBvo();
        info.setHost("smtp.163.com");
        info.setFormName("xxxiot@163.com");
        info.setFormPassword("xxxiot1994");
        info.setReplayAddress("xxxiot@163.com");

        info.setToAddress(email);

        info.setSubject("车联网智能分析系统，密码已找回，请查收！");
        info.setContent("你的用户名为："+user.getUsername()+",你的密码为："+decryptPassword+".");

        try {
            //发送文本邮件
            MailUtils.sendTextMail(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
