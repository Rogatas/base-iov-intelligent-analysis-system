package utils.common;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by liguodong on 2016/4/19.
 */
public class DateUtils {

    private DateUtils(){
    }

    public static String String2Timestamp(String datatimeStr){

        DateTimeFormatter format = DateTimeFormat.forPattern("yyyyMMdd");
        DateTime dateTime = DateTime.parse(datatimeStr, format);

        String str = dateTime.toString("yyyy-MM-dd HH:mm:ss");

        System.out.println(str);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String result = null;

        try {
            result = String.valueOf(sdf.parse(str).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(String2Timestamp("20160401"));

    }


}
