package report.lgd.service;

import com.lgd.model.pojo.BaseInfoVehicleInner;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */
public interface BaseInfoVehicleInnerService {

    public List<BaseInfoVehicleInner> queryMax();

    public List<BaseInfoVehicleInner> queryAverage();

    public List<BaseInfoVehicleInner> queryMin();

}
