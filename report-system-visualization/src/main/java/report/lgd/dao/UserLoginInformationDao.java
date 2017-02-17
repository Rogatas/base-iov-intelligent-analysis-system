package report.lgd.dao;


import com.lgd.model.pojo.UserLoginInformation;

import java.util.List;
import java.util.Map;

/**
 * 判断用户登录
 *
 * Created by liguodong on 2016/3/29.
 */
public interface UserLoginInformationDao {

    //判断是否能够登录
    public int hasUserAndPasswd(Map map);

    //查询基本信息
    public List<UserLoginInformation> queryBaseInfo(Map map);


    public List<UserLoginInformation> testQuery();



}
