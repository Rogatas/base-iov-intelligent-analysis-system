package report.lgd.controller;

import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleSpeedRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.service.VehicleRangePercentCountService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 车辆参数范围百分比统计
 * Created by liguodong on 2016/4/17.
 */

@Controller
@RequestMapping("/catalog/vehicleRangePercentCount")
public class VehicleRangePercentCountController {

    //目录
    private final String PREFIX="content/";

    @Autowired
    VehicleRangePercentCountService vehicleRangePercentCountService;

    public void setVehicleRangePercentCountService(VehicleRangePercentCountService vehicleRangePercentCountService) {
        this.vehicleRangePercentCountService = vehicleRangePercentCountService;
    }

    @RequestMapping("/index")
    public String enter(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"vehicleRangePercentCount";
    }


    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata/speed")
    @ResponseBody
    public List<VehicleSpeedRange> datasSpeed(Model model){

        List<VehicleSpeedRange> list = vehicleRangePercentCountService.querySpeed();
        //model.addAttribute("datas",list);

        return list;
    }

    @RequestMapping("/showdata/enginespeed")
    @ResponseBody
    public List<VehicleEngineSpeedRange> datasEngineSpeed(Model model){

        List<VehicleEngineSpeedRange> list = vehicleRangePercentCountService.queryEngineSpeed();

        return list;
    }



    @RequestMapping("/showdata/enginetem")
    @ResponseBody
    public List<VehicleEngineTemRange> datasEngineTem(Model model){

        List<VehicleEngineTemRange> list = vehicleRangePercentCountService.queryEngineTem();

        return list;
    }


    @RequestMapping("/showdata/engineload")
    @ResponseBody
    public List<VehicleEngineLoadRange> datasEngineLoad(Model model){

        List<VehicleEngineLoadRange> list = vehicleRangePercentCountService.queryEngineLoad();

        return list;
    }


}
