package report.lgd.dao.impl;

import com.lgd.model.pojo.BaseInfoVehicleInner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.BaseInfoVehicleInnerDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/19.
 */

@Repository("baseInfoVehicleInnerDao")
public class BaseInfoVehicleInnerDaoImpl extends SqlSessionDaoSupport
        implements BaseInfoVehicleInnerDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    @Override
    public List<BaseInfoVehicleInner> queryMax() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleInnerMapper.queryMax");
    }

    @Override
    public List<BaseInfoVehicleInner> queryAverage() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleInnerMapper.queryAverage");
    }

    @Override
    public List<BaseInfoVehicleInner> queryMin() {
        return getSqlSession().selectList("report.lgd.content.baseInfoVehicleInnerMapper.queryMin");
    }
}
