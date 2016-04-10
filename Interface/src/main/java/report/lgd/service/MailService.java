package report.lgd.service;

/**
 * Created by liguodong on 2016/4/10.
 */
public interface MailService {

    public boolean isEmailExists(String email);

    public void sendMail(String email);

}
