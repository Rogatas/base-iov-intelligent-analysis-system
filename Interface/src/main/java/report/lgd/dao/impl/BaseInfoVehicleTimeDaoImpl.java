package report.lgd.dao.impl;

import com.lgd.model.pojo.BaseInfoVehicleTime;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.BaseInfoVehicleTimeDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */

@Repository("baseInfoVehicleTimeDao")
public class BaseInfoVehicleTimeDaoImpl extends SqlSessionDaoSupport
        implements BaseInfoVehicleTimeDao {


    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<BaseInfoVehicleTime> queryOilWear() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleTimeMapper.queryOilWear");
    }

    @Override
    public List<BaseInfoVehicleTime> queryIntakeTem() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleTimeMapper.queryIntakeTem");
    }

    @Override
    public List<BaseInfoVehicleTime> queryAirFlow() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleTimeMapper.queryAirFlow");
    }

    @Override
    public List<BaseInfoVehicleTime> queryBatteryVoltage() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleTimeMapper.queryBatteryVoltage");
    }

    @Override
    public List<BaseInfoVehicleTime> queryCoolantTem() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleTimeMapper.queryCoolantTem");
    }
}
