package report.lgd.dao.impl;

import com.lgd.model.pojo.RecentEngineSpeedRange;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.bvo.VinDimensionCountBvo;
import report.lgd.dao.RecentEngineSpeedRangeDao;

import java.util.List;

/**
 * Created by liguodong on 2016/4/17.
 */

@Repository("recentEngineSpeedRangeDao")
public class RecentEngineSpeedRangeDaoImpl extends SqlSessionDaoSupport
        implements RecentEngineSpeedRangeDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<RecentEngineSpeedRange> query() {
        return getSqlSession().selectList("report.lgd.content.recentEngineSpeedRangeMapper.query");
    }

}
