package report.lgd.service;

import com.lgd.model.pojo.BaseInfoVehicleTime;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */
public interface BaseInfoVehicleTimeService {

    public List<BaseInfoVehicleTime> queryOilWear();

    public List<BaseInfoVehicleTime> queryIntakeTem();

    public List<BaseInfoVehicleTime> queryAirFlow();

    public List<BaseInfoVehicleTime> queryBatteryVoltage();

    public List<BaseInfoVehicleTime> queryCoolantTem();

}
