package report.lgd.controller;

import com.lgd.model.pojo.BaseInfoVehicleTime;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.service.BaseInfoVehicleTimeService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 基于时间维度的车辆基本信息
 *
 * Created by liguodong on 2016/4/19.
 */

@Controller
@RequestMapping("/catalog/baseInfoVehicleTime")
public class BaseInfoVehicleTimeController {


    //目录
    private final String PREFIX="content/";


    @Autowired
    BaseInfoVehicleTimeService baseInfoVehicleTimeService;

    public void setBaseInfoVehicleTimeService(BaseInfoVehicleTimeService baseInfoVehicleTimeService) {
        this.baseInfoVehicleTimeService = baseInfoVehicleTimeService;
    }

    @RequestMapping("/index/oilWear")
    public String enterOilWear(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleTimeOilWear";
    }


    @RequestMapping("/index/intakeTem")
    public String enterIntakeTem(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleTimeIntakeTem";
    }


    @RequestMapping("/index/airFlow")
    public String enterAirFlow(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleTimeAirFlow";
    }

    @RequestMapping("/index/batteryVoltage")
    public String enterBatteryVoltage(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleTimeBatteryVoltage";
    }

    @RequestMapping("/index/coolantTem")
    public String enterCoolantTem(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"baseInfoVehicleTimeCoolantTem";
    }


    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata/oilWear")
    @ResponseBody
    public List<BaseInfoVehicleTime> datasOilWear(Model model){

        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeService.queryOilWear();
        //model.addAttribute("datas",list);

        return list;
    }


    @RequestMapping("/showdata/intakeTem")
    @ResponseBody
    public List<BaseInfoVehicleTime> datasIntakeTem(Model model){

        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeService.queryIntakeTem();
        //model.addAttribute("datas",list);

        return list;
    }



    @RequestMapping("/showdata/airFlow")
    @ResponseBody
    public List<BaseInfoVehicleTime> datasAirFlow(Model model) throws ParseException {

        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeService.queryAirFlow();
        //model.addAttribute("datas",list);

        //DateTime dateTime = new Datetime();

        return list;
    }

    @RequestMapping("/showdata/batteryVoltage")
    @ResponseBody
    public List<BaseInfoVehicleTime> datasBatteryVoltage(Model model){

        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeService.queryBatteryVoltage();
        //model.addAttribute("datas",list);

        return list;
    }

    @RequestMapping("/showdata/coolantTem")
    @ResponseBody
    public List<BaseInfoVehicleTime> datasCoolantTem(Model model){

        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeService.queryCoolantTem();
        //model.addAttribute("datas",list);

        return list;
    }

}
