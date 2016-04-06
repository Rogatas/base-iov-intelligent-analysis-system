package report.lgd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.service.VinDimensionCountService;

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
    public String settings(Model model){

        List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("infoData",list);
        return PREFIX+"vinDimensionCount";
    }

}
