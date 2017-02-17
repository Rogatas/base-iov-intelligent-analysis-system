import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liguodong on 2016/4/11.
 */
public class PatternTests {

    @Test
    public void test(){

        Pattern pattern = Pattern.compile("[\\w]+");

        //创建Matcher对象
        Matcher matcher = pattern.matcher("liguodong");//尝试将整个字符串序列与该模式匹配

        boolean yesno = matcher.matches();
        System.out.println(yesno);

    }



}
