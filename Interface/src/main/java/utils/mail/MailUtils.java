package utils.mail;

import report.lgd.bvo.MailBvo;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by liguodong on 2016/4/10.
 */
public class MailUtils {


    public static void sendHtmlMail(MailBvo info) throws Exception {
        Message message = getMessage(info);
        message.setContent(info.getContent(), "text/html;charset=utf-8");
        Transport.send(message);
    }

    public static void sendTextMail(MailBvo info) throws Exception {
        Message message = getMessage(info);
        message.setText(info.getContent());
        Transport.send(message);
    }

    private static Message getMessage(MailBvo info) throws Exception {
        final Properties p = System.getProperties();
        p.setProperty("mail.smtp.host", info.getHost());
        p.setProperty("mail.smtp.auth", "true");
        p.setProperty("mail.smtp.user", info.getFormName());
        p.setProperty("mail.smtp.pass", info.getFormPassword());

        Session session = Session.getInstance(p, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(p.getProperty("mail.smtp.user"),
                        p.getProperty("mail.smtp.pass"));
            }
        });
        session.setDebug(true);
        Message message = new MimeMessage(session);
        message.setSubject(info.getSubject());
        message.setReplyTo(InternetAddress.parse(info.getReplayAddress()));
        message.setFrom(new InternetAddress(p.getProperty("mail.smtp.user"), "网站管理员"));
        message.setRecipient(Message.RecipientType.TO,
                new InternetAddress(info.getToAddress()));

        return message;
    }


}
