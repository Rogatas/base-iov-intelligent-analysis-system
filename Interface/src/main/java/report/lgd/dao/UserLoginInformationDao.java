package report.lgd.dao;


import com.lgd.model.pojo.UserLoginInformation;

import java.util.List;
import java.util.Map;

/**
 * Created by liguodong on 2016/3/29.
 */
public interface UserLoginInformationDao {

    public int hasUserAndPasswd(Map map);


    public List<UserLoginInformation> testQuery();



}
