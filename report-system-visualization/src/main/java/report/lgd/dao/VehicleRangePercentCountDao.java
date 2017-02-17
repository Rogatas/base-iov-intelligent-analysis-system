package report.lgd.dao;

import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleSpeedRange;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */
public interface VehicleRangePercentCountDao {

    //查询速度
    public List<VehicleSpeedRange> querySpeed();

    //查询引擎速度
    public List<VehicleEngineSpeedRange> queryEngineSpeed();

    //查询引擎温度
    public List<VehicleEngineTemRange> queryEngineTem();

    //查询引擎负荷
    public List<VehicleEngineLoadRange> queryEngineLoad();

}
