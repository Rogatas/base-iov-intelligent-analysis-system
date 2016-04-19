package report.lgd.service.impl;


import com.lgd.model.pojo.BaseInfoVehicleInner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.dao.BaseInfoVehicleInnerDao;
import report.lgd.service.BaseInfoVehicleInnerService;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */

@Service("baseInfoVehicleInnerService")
public class BaseInfoVehicleInnerServiceImpl
        implements BaseInfoVehicleInnerService {


    @Autowired
    BaseInfoVehicleInnerDao baseInfoVehicleInnerDao;

    public void setBaseInfoVehicleInnerDao(BaseInfoVehicleInnerDao baseInfoVehicleInnerDao) {
        this.baseInfoVehicleInnerDao = baseInfoVehicleInnerDao;
    }


    @Override
    public List<BaseInfoVehicleInner> queryMax() {
        return baseInfoVehicleInnerDao.queryMax();
    }

    @Override
    public List<BaseInfoVehicleInner> queryAverage() {
        return baseInfoVehicleInnerDao.queryAverage();
    }

    @Override
    public List<BaseInfoVehicleInner> queryMin() {
        return baseInfoVehicleInnerDao.queryMin();
    }
}
