package report.lgd.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import report.lgd.dao.SettingsDao;

import java.util.Map;

/**
 * Created by liguodong on 2016/4/5.
 */

@Repository("settingsDao")
public class SettingsDaoImpl extends SqlSessionDaoSupport implements SettingsDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int queryEmail(Map<String, Object> map) {
        return this.getSqlSession().selectOne("report.lgd.settings.userinfo.queryEmail",map);
    }

    @Override
    public int updateBaseInfo(Map<String, Object> map) {
        return this.getSqlSession().update("report.lgd.settings.userinfo.updateBaseInfo",map);
    }

    @Override
    public int updatePassword(Map<String, Object> map) {
        return this.getSqlSession().update("report.lgd.settings.userinfo.updatePassword",map);
    }
}
