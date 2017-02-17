package demos;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Created by liguodong on 2016/4/9.
 */
public class MethodTest {
    public static void main(String[] args) {

        String str = "2014/6/2";

        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy/MM/dd");
        DateTime dateTime = DateTime.parse(str, format);
        String dateString = dateTime.toString("yyyyMMdd");
        System.out.println(dateString);



    }
}
