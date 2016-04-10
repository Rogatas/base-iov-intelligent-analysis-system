package report.lgd.dao;

import com.lgd.model.pojo.UserLoginInformation;


import java.util.List;
import java.util.Map;

/**
 * Created by liguodong on 2016/4/10.
 */


public interface MailDao {

    public int queryEmail(Map<String,Object> map);

    public List<UserLoginInformation> queryPassword(Map<String,Object> map);

}
