package report.lgd.controller;

import com.lgd.model.pojo.UserLoginInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import report.lgd.service.UserLoginInformationService;
import utils.common.UserUtils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * 登录控制器
 * Created by liguodong on 2016/3/26.
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    //目录
    private final String PREFIX="catalog/";

    //private static String username = null;

    @Autowired
    UserLoginInformationService userLoginInformationService;

    public void setUserLoginInformationService(UserLoginInformationService userLoginInformationService) {
        this.userLoginInformationService = userLoginInformationService;
    }

    @RequestMapping("/passwdauth")
    public String login(final UserLoginInformation user,
                        ModelMap modelMap,HttpSession session)
            throws IOException {

        System.out.println(LoginController.class+"-->"+
                user.getUsername() + ":" + user.getPassword());

        if(user.getUsername()==null || user.getPassword() ==null ||
                user.getUsername().equals("")||user.getPassword().equals("")){
            modelMap.addAttribute("msg", "账号或者密码不能为空!");

            return "forward:/login.jsp";
        }

        if(userLoginInformationService.hasUserAndPasswd
                (user.getUsername(),user.getPassword()))
        {

            List<UserLoginInformation> list =
                    userLoginInformationService.queryBaseInfo(
                            user.getUsername(), user.getPassword());

            UserLoginInformation userLoginInformation = list.get(0);

            session.setAttribute("user",userLoginInformation);

            //username = user.getUsername();
            System.out.println("login success...");

            return "redirect:main.do";
        }
        System.out.println("false");
        modelMap.addAttribute("msg", "账号不存在或者密码错误!");

        return "forward:/login.jsp";
    }


    @RequestMapping("/main")
    public String mianFrame(ModelMap modelMap,HttpSession session){

        modelMap.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"main";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "forward:/login.jsp";
    }


    @RequestMapping("/settings")
    public String settings(ModelMap modelMap,HttpSession session){

        modelMap.addAttribute("username",UserUtils.getNikeOrUserName(session,"user"));

        return PREFIX+"settings";
    }

}
