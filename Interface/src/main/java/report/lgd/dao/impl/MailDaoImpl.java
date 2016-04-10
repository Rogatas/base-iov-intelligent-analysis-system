package report.lgd.dao.impl;

import com.lgd.model.pojo.UserLoginInformation;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.MailDao;

import java.util.List;
import java.util.Map;

/**
 * Created by liguodong on 2016/4/10.
 */

@Repository("mailDao")
public class MailDaoImpl extends SqlSessionDaoSupport implements MailDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int queryEmail(Map<String, Object> map) {
        return getSqlSession().selectOne("report.lgd.mail.baseInfo.queryEmail",map);
    }

    @Override
    public List<UserLoginInformation> queryPassword(Map<String, Object> map) {
        return getSqlSession().selectList("report.lgd.mail.baseInfo.queryPassword", map);
    }


}
