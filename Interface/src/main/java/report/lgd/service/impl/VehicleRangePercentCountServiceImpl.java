package report.lgd.service.impl;


import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleSpeedRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.dao.VehicleRangePercentCountDao;
import report.lgd.service.VehicleRangePercentCountService;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */

@Service("vehicleRangePercentCountService")
public class VehicleRangePercentCountServiceImpl
        implements VehicleRangePercentCountService {

    @Autowired
    VehicleRangePercentCountDao vehicleRangePercentCountDao;

    public void setVehicleRangePercentCountDao(VehicleRangePercentCountDao vehicleRangePercentCountDao) {
        this.vehicleRangePercentCountDao = vehicleRangePercentCountDao;
    }

    @Override
    public List<VehicleSpeedRange> querySpeed() {
        return vehicleRangePercentCountDao.querySpeed();
    }

    @Override
    public List<VehicleEngineSpeedRange> queryEngineSpeed() {
        return vehicleRangePercentCountDao.queryEngineSpeed();
    }

    @Override
    public List<VehicleEngineTemRange> queryEngineTem() {
        return vehicleRangePercentCountDao.queryEngineTem();
    }

    @Override
    public List<VehicleEngineLoadRange> queryEngineLoad() {
        return vehicleRangePercentCountDao.queryEngineLoad();
    }
}
