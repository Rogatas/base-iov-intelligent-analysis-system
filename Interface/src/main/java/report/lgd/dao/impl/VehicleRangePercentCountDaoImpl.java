package report.lgd.dao.impl;

import com.lgd.model.pojo.VehicleEngineLoadRange;
import com.lgd.model.pojo.VehicleEngineSpeedRange;
import com.lgd.model.pojo.VehicleEngineTemRange;
import com.lgd.model.pojo.VehicleSpeedRange;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.VehicleRangePercentCountDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */

@Repository("vehicleRangePercentCountDao")
public class VehicleRangePercentCountDaoImpl extends SqlSessionDaoSupport
        implements VehicleRangePercentCountDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    @Override
    public List<VehicleSpeedRange> querySpeed() {
        return getSqlSession().selectList("report.lgd.content.vehicleRangePercentCountMapper.querySpeed");
    }

    @Override
    public List<VehicleEngineSpeedRange> queryEngineSpeed() {
        return getSqlSession().selectList("report.lgd.content.vehicleRangePercentCountMapper.queryEngineSpeed");
    }

    @Override
    public List<VehicleEngineTemRange> queryEngineTem() {
        return getSqlSession().selectList("report.lgd.content.vehicleRangePercentCountMapper.queryEngineTem");
    }

    @Override
    public List<VehicleEngineLoadRange> queryEngineLoad() {
        return getSqlSession().selectList("report.lgd.content.vehicleRangePercentCountMapper.queryEngineLoad");
    }


}
