package report.lgd.controller;

import com.lgd.model.pojo.RecentEngineSpeedRange;
import com.lgd.model.pojo.VehicleMaxCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.service.RecentEngineSpeedRangeService;
import utils.common.UserUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */


@Controller
@RequestMapping("/catalog/recentEngineSpeedRange")
public class RecentEngineSpeedRangeController {

    //目录
    private final String PREFIX="content/";

    @Autowired
    RecentEngineSpeedRangeService recentEngineSpeedRangeService;

    public void setRecentEngineSpeedRangeService(RecentEngineSpeedRangeService recentEngineSpeedRangeService) {
        this.recentEngineSpeedRangeService = recentEngineSpeedRangeService;
    }

    @RequestMapping("/index")
    public String enter(Model model,HttpSession session){
        /*List<VinDimensionCountBvo> list = vinDimensionCountService.query();
        model.addAttribute("datas",list);*/
        model.addAttribute("username", UserUtils.getNikeOrUserName(session, "user"));

        return PREFIX+"recentEngineSpeedRange";
    }



    /**
     * 通过ajax返回数据到前端页面
     * @param model
     * @return
     */
    @RequestMapping("/showdata")
    @ResponseBody
    public List<RecentEngineSpeedRange> datas(Model model){

        List<RecentEngineSpeedRange> list = recentEngineSpeedRangeService.query();
        //model.addAttribute("datas",list);
        return list;
    }

}
