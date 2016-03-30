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

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * Created by liguodong on 2016/3/26.
 */

@Controller
@RequestMapping("/login")
public class LoginController {

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
            session.setAttribute("user",user);

            System.out.println("login success...");

            return "redirect:main.do";
        }
        System.out.println("false");
        modelMap.addAttribute("msg", "账号不存在或者密码错误!");



        return "forward:/login.jsp";
    }


    @RequestMapping("/main")
    public String add(){
        return "hello";
    }
}
