package report.lgd.dao.impl;

import com.lgd.model.pojo.UserLoginInformation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.UserLoginInformationDao;

import java.util.List;
import java.util.Map;

/**
 * Created by liguodong on 2016/3/29.
 */

@Repository("userLoginInformationDao")
public class UserLoginInformationDaoImpl
        extends SqlSessionDaoSupport implements UserLoginInformationDao {


    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }



    @Override
    public int hasUserAndPasswd(Map map) {

        return getSqlSession().selectOne("report.lgd.login.userLoginMapper.hasPassNum",map);
    }

    @Override
    public List<UserLoginInformation> queryBaseInfo(Map map) {

        return getSqlSession().selectList("report.lgd.login.userLoginMapper.queryBaseInfo", map);
    }


    @Override
    public List<UserLoginInformation> testQuery() {
        return getSqlSession().selectList("report.lgd.login.userLoginMapper.query");
    }
}
