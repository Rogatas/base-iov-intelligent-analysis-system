package report.lgd.dao;

import java.util.Map;

/**
 *
 * 设置昵称，修改密码
 * Created by liguodong on 2016/4/5.
 */
public interface SettingsDao {

    public int queryEmail(Map<String,Object> map);

    public int updateBaseInfo(Map<String,Object> map);

    public int updatePassword(Map<String,Object> map);
}
