package report.lgd.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liguodong on 2016/3/23.
 */

@Controller
@RequestMapping("/page/view")
public class HelloAnnoController {

    Log logger = LogFactory.getLog(HelloAnnoController.class);

    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello springmvc...");
        mv.setViewName("hello");// /WEB-INF/page/jsp/hello.jsp

        logger.info("HelloAnnoController.hello");

        return mv;
    }


    @RequestMapping("/helloServlet")
    public void helloServlet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        //不用配置视图解析器

        //resp.getWriter().println("hello spring mvc use httpservlet api")

        //页面必须放在WIB-INF外面
        resp.sendRedirect("/index.jsp");
    }


    //Spring MVC有视图解析器时，页面在web-inf下
    //没有配置视图解析器，页面放在web-inf外面
    @RequestMapping("/helloSpringMVC")
    public String helloSpringMVC(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        return "hello";
    }


    @RequestMapping("/helloParam")
    public String helloParam(String name) throws IOException {

        System.out.println(name);

        return "hello";
    }


    @RequestMapping("/helloRestful/{id}/{uid}")
    public String helloRestful(@PathVariable int id,
                               @PathVariable int uid){

        System.out.println("id:"+id);
        System.out.println("uid:"+uid);
        return "hello";
    }

    //http://localhost:8080/page/view/helloRestful2/1/123.do
    @RequestMapping("/helloRestful2/{id}/{uid}")
    public String helloRestful2(@PathVariable("uid") int id,
                               @PathVariable("id") int uid){

        System.out.println("id:"+id);
        System.out.println("uid:"+uid);
        return "hello";
    }

}
