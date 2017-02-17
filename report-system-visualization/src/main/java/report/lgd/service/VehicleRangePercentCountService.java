package report.lgd.service;

import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleSpeedRange;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */
public interface VehicleRangePercentCountService {

    public List<VehicleSpeedRange> querySpeed();

    public List<VehicleEngineSpeedRange> queryEngineSpeed();

    public List<VehicleEngineTemRange> queryEngineTem();

    public List<VehicleEngineLoadRange> queryEngineLoad();

}
