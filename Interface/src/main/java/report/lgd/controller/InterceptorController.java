package report.lgd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liguodong on 2016/3/26.
 */

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello interceptor controller");
        return "hello";
    }


}
