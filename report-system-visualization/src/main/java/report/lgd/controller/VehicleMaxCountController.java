package report.lgd.controller;

import com.lgd.model.pojo.VehicleMaxCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.service.VehicleMaxCountService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 车辆参数极值统计
 * Created by liguodong on 2016/4/16.
 */

@Controller
@RequestMapping("/catalog/vehicleMaxCount")
public class VehicleMaxCountController {

    //目录
    private final String PREFIX="content/";


    @Autowired
    VehicleMaxCountService vehicleMaxCountService;

    public void setVehicleMaxCountService(VehicleMaxCountService vehicleMaxCountService) {
        this.vehicleMaxCountService = vehicleMaxCountService;
    }

    @RequestMapping("/index")
    public String enter(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"vehicleMaxCount";
    }


    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata")
    @ResponseBody
    public List<VehicleMaxCount> datas(Model model){

        List<VehicleMaxCount> list = vehicleMaxCountService.query();
        //model.addAttribute("datas",list);

        return list;
    }


}
