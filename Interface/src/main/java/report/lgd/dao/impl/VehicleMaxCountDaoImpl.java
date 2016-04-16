package report.lgd.dao.impl;

import com.lgd.model.pojo.VehicleMaxCount;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.VehicleMaxCountDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/16.
 */

@Repository("vehicleMaxCountDao")
public class VehicleMaxCountDaoImpl extends SqlSessionDaoSupport
        implements VehicleMaxCountDao {


    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    @Override
    public List<VehicleMaxCount> query() {
        return getSqlSession().selectList("report.lgd.content.vehicleMaxCountMapper.query");
    }


}
