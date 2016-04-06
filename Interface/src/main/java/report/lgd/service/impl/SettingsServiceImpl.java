package report.lgd.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.dao.SettingsDao;
import report.lgd.service.SettingsService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liguodong on 2016/4/5.
 */

@Service("settingsService")
public class SettingsServiceImpl implements SettingsService {


    @Autowired
    SettingsDao settingsDao;

    public void setSettingsDao(SettingsDao settingsDao) {
        this.settingsDao = settingsDao;
    }

    @Override
    public boolean updateBaseInfo(String username, String nickname, String email) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username",username);
        map.put("nickname",nickname);
        map.put("email", email);
        return settingsDao.updateBaseInfo(map)==1?true:false;
    }

    @Override
    public boolean updatePassword(String username, String password) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);

        return settingsDao.updatePassword(map)==1?true:false;
    }
}
