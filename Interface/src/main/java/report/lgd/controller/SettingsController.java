package report.lgd.controller;

import com.lgd.model.pojo.UserLoginInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import report.lgd.service.SettingsService;
import report.lgd.service.UserLoginInformationService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;

/**
 *
 * 设置邮箱，密码，昵称
 * Created by liguodong on 2016/4/4.
 */
@Controller
@RequestMapping("/settings")
public class SettingsController {


    @Autowired
    SettingsService settingsService;

    private final String PREFIX="catalog/";

    public void setSettingsService(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    //modify base infomation
    @RequestMapping("/base/info")
    public String baseInfo(
            @RequestParam(value = "nickname", required = false) String nickname,
            @RequestParam(value = "email", required = false) String email,
            ModelMap modelMap,
            HttpSession session){
        Object user = session.getAttribute("user");
        UserLoginInformation userLoginInformation = (UserLoginInformation)user;

        if(settingsService.updateBaseInfo(userLoginInformation.getUsername(),nickname,email)){
            modelMap.addAttribute("msgInfo", "修改成功");
            if(nickname!=null && !nickname.equals("")){
                userLoginInformation.setNickname(nickname);
            }
            if(email !=null && !email.equals("")){
                userLoginInformation.setEmail(email);
            }

        }else{
            modelMap.addAttribute("msgInfo","修改失败");
        }

        modelMap.addAttribute("username", UserUtils.getNikeOrUserName(userLoginInformation));

        return PREFIX+"settings";
    }


    //modify password

    /**
     * required 是否必须
     */
    @RequestMapping("/modify/password")
    public String modifyPassword(
            @RequestParam(value = "passwd", required = true) String passwd,
            @RequestParam(value = "passwdConfirm", required = true) String passwdConfirm,
            ModelMap modelMap,
            HttpSession session){

        if(passwd==null || passwd.equals("") ||
                passwdConfirm==null || passwdConfirm.equals("")){
            modelMap.addAttribute("msgPasswd","密码不能为空");
            return PREFIX+"settings";
        }

        if(!passwd.equals(passwdConfirm)){
            modelMap.addAttribute("msgPasswd","密码不相等");
            return PREFIX+"settings";
        }


        Object user = session.getAttribute("user");
        UserLoginInformation userLoginInformation = (UserLoginInformation)user;


        if(settingsService.updatePassword(userLoginInformation.getUsername(),passwd)){
            modelMap.addAttribute("msgPasswd","修改成功");
        }else{
            modelMap.addAttribute("msgPasswd","修改失败");
        }

        modelMap.addAttribute("username", UserUtils.getNikeOrUserName(userLoginInformation));

        return PREFIX+"settings";
    }


}
