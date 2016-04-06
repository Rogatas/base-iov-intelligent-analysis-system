package report.lgd.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.dao.VinDimensionCountDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/3.
 */
@Repository("vinDimensionCountDao")
public class VinDimensionCountDaoImpl extends SqlSessionDaoSupport
        implements VinDimensionCountDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<VinDimensionCountBvo> query() {
        return getSqlSession().selectList("report.lgd.content.vinDimensionCountMapper.query");
    }
}
