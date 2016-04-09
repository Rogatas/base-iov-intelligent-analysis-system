package report.lgd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.service.VinDimensionCountService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * vin码各维度统计控制器
 * Created by liguodong on 2016/4/3.
 */

@Controller
@RequestMapping("/catalog")
public class VinDimensionCountController {

    //目录
    private final String PREFIX="content/";

    @Autowired
    VinDimensionCountService vinDimensionCountService;

    public void setVinDimensionCountService(VinDimensionCountService vinDimensionCountService) {
        this.vinDimensionCountService = vinDimensionCountService;
    }

    @RequestMapping("/vinDimensionCount")
    public String enter(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"vinDimensionCount";
    }

    @RequestMapping("/showdata")
    @ResponseBody
    public List<VinDimensionCountBvo> datas(Model model){
        List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        //model.addAttribute("datas",list);
        return list;
    }


}
