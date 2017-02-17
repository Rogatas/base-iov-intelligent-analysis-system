package report.lgd.service;

/**
 * Created by liguodong on 2016/4/5.
 */
public interface SettingsService {

    public boolean isExistEmail(String email);

    public boolean updateBaseInfo(String username,String nickname,String email);

    public boolean updatePassword(String username,String password);
}
