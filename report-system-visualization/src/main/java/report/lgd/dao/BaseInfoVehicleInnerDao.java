package report.lgd.dao;

import com.lgd.model.pojo.BaseInfoVehicleInner;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */
public interface BaseInfoVehicleInnerDao {

    public List<BaseInfoVehicleInner> queryMax();

    public List<BaseInfoVehicleInner> queryAverage();

    public List<BaseInfoVehicleInner> queryMin();
}
