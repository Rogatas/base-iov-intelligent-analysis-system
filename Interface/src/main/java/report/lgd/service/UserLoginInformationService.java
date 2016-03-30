package report.lgd.service;

import com.lgd.model.pojo.UserLoginInformation;

import java.util.List;

/**
 * Created by liguodong on 2016/3/29.
 */

public interface UserLoginInformationService {

    public boolean hasUserAndPasswd(String username,String password);


    public List<UserLoginInformation> testQuery();
}
