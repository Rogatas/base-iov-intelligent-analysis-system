package report.lgd.service.impl;

import com.lgd.model.pojo.VehicleMaxCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.dao.VehicleMaxCountDao;
import report.lgd.service.VehicleMaxCountService;

import java.util.List;

/**
 * Created by liguodong on 2016/4/16.
 */

@Service("vehicleMaxCountService")
public class VehicleMaxCountServiceImpl implements VehicleMaxCountService {

    @Autowired
    VehicleMaxCountDao vehicleMaxCountDao;

    public void setVehicleMaxCountDao(VehicleMaxCountDao vehicleMaxCountDao) {
        this.vehicleMaxCountDao = vehicleMaxCountDao;
    }


    @Override
    public List<VehicleMaxCount> query() {

        return vehicleMaxCountDao.query();
    }


}
