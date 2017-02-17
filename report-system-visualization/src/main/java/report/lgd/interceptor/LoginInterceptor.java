package report.lgd.interceptor;

import com.lgd.model.pojo.UserLoginInformation;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 登录拦截器
 * Created by liguodong on 2016/3/26.
 */
public class LoginInterceptor implements HandlerInterceptor{

    //允许那些url不被拦截，那些需要被拦截
    private List<String> allowedPass;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object o) throws Exception {

        String url = request.getRequestURL().toString();


        //先判断session中是否有
        Object user = request.getSession().getAttribute("user");

        if(user != null){
            UserLoginInformation userLoginInformation = (UserLoginInformation)user;
            System.out.println(LoginInterceptor.class+"-->"+
                    userLoginInformation.getUsername()+":"
                    +userLoginInformation.getPassword());

            return true;
        }


        //判断哪些被拦截，哪些不被拦截
        for(String temp:allowedPass){
            if(url.endsWith(temp)){
                return true;
            }
        }
        response.sendRedirect("/login.jsp");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    public void setAllowedPass(List<String> allowedPass) {
        this.allowedPass = allowedPass;
    }
}
