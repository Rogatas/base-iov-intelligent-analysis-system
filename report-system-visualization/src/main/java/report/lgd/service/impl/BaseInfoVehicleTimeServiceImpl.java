package report.lgd.service.impl;

import com.lgd.model.pojo.BaseInfoVehicleTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import report.lgd.dao.BaseInfoVehicleTimeDao;
import report.lgd.service.BaseInfoVehicleTimeService;
import utils.common.DateUtils;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */

@Service("baseInfoVehicleTimeService")
public class BaseInfoVehicleTimeServiceImpl implements BaseInfoVehicleTimeService {

    @Autowired
    BaseInfoVehicleTimeDao baseInfoVehicleTimeDao;

    public void setBaseInfoVehicleTimeDao(BaseInfoVehicleTimeDao baseInfoVehicleTimeDao) {
        this.baseInfoVehicleTimeDao = baseInfoVehicleTimeDao;
    }

    @Override
    public List<BaseInfoVehicleTime> queryOilWear() {
        return baseInfoVehicleTimeDao.queryOilWear();
    }

    @Override
    public List<BaseInfoVehicleTime> queryIntakeTem() {
        return baseInfoVehicleTimeDao.queryIntakeTem();
    }

    @Override
    public List<BaseInfoVehicleTime> queryAirFlow() {
        List<BaseInfoVehicleTime> list = baseInfoVehicleTimeDao.queryAirFlow();

//        if(list!=null && list.size()>0){
//            for (BaseInfoVehicleTime temp:list){
//                String timeStamp = DateUtils.String2Timestamp(temp.getStorageTime());
//                temp.setStorageTime(timeStamp);
//            }
//        }

        return list;
    }

    @Override
    public List<BaseInfoVehicleTime> queryBatteryVoltage() {
        return baseInfoVehicleTimeDao.queryBatteryVoltage();
    }

    @Override
    public List<BaseInfoVehicleTime> queryCoolantTem() {
        return baseInfoVehicleTimeDao.queryCoolantTem();
    }
}
