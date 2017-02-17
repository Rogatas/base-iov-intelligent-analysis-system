package report.lgd.controller;

import com.lgd.model.pojo.BaseInfoVehicleInner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.service.BaseInfoVehicleInnerService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 基于车辆ID维度的车辆基本信息
 *
 * Created by liguodong on 2016/4/19.
 */

@Controller
@RequestMapping("/catalog/baseInfoVehicleInner")
public class BaseInfoVehicleInnerController {

    //目录
    private final String PREFIX="content/";


    @Autowired
    BaseInfoVehicleInnerService baseInfoVehicleInnerService;

    public void setBaseInfoVehicleInnerService(BaseInfoVehicleInnerService baseInfoVehicleInnerService) {
        this.baseInfoVehicleInnerService = baseInfoVehicleInnerService;
    }

    @RequestMapping("/index/max")
    public String enterMax(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleInnerMax";
    }


    @RequestMapping("/index/average")
    public String enterAverage(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleInnerAverage";
    }


    @RequestMapping("/index/min")
    public String enterMin(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleInnerMin";
    }



    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata/max")
    @ResponseBody
    public List<BaseInfoVehicleInner> datasMax(Model model){

        List<BaseInfoVehicleInner> list = baseInfoVehicleInnerService.queryMax();
        //model.addAttribute("datas",list);

        return list;
    }

    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata/average")
    @ResponseBody
    public List<BaseInfoVehicleInner> datasAverage(Model model){

        List<BaseInfoVehicleInner> list = baseInfoVehicleInnerService.queryAverage();
        //model.addAttribute("datas",list);

        return list;
    }


    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata/min")
    @ResponseBody
    public List<BaseInfoVehicleInner> datasMin(Model model){

        List<BaseInfoVehicleInner> list = baseInfoVehicleInnerService.queryMin();
        //model.addAttribute("datas",list);

        return list;
    }

}
