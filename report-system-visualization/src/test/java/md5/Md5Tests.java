package md5;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;


/**
 * Created by liguodong on 2016/4/9.
 */
public class Md5Tests {

    @Test
    public void md5Encode(){
        System.out.println(MD5.getMD5(MD5.getMD5("liguodong")));
        //System.out.println(MD5.convertMD5("c7702831fa02f7f5c6b9a41aaa221032"));

        System.out.println(
                        MD5Util.convertMD5(
                                MD5Util.convertMD5(MD5.getMD5("liguodong"))));

        System.out.println(MD5Util.convertMD5(
                MD5Util.convertMD5(
                        MD5Util.convertMD5(
                                MD5Util.convertMD5(MD5.getMD5(MD5.getMD5("liguodong")))))));



        String s = new String("liguodong");
        System.out.println("原始：" + s);
        System.out.println("MD5后：" + MD5Util.string2MD5(s));
        System.out.println("加密的：" + MD5Util.convertMD5(s));
        System.out.println("解密的：" + MD5Util.convertMD5(MD5Util.convertMD5(s)));



    }

}















class MD5 {

    /**
     * 使用的固定数字编码
     *
     * @author Quinn He
     * @dateTime 2012-6-4 下午10:03:42
     */
    private final static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    /**
     * 获得指定字串的MD5编码
     *
     * @author Quinn He
     * @dateTime 2012-6-4 下午10:03:42
     * @param target 目标字串
     * @return MD5编码
     */
    public final static String getMD5(final String target) {
        try {
            // 使用MD5创建MessageDigest对象
            final MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            final byte[] md = mdTemp.digest(target.getBytes("UTF-8"));
            final int j = md.length;
            final char str[] = new char[j * 2];
            byte b;
            for (int i = 0, k = 0; i < j; i++) {
                b = md[i];
                str[k++] = MD5.hexDigits[(b >> 4) & 0xf];
                str[k++] = MD5.hexDigits[b & 0xf];
            }
            return new String(str);
        } catch (final Exception e) {
            return null;
        }
    }


    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    public static String convertMD5(String inStr){

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++){
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;

    }
}


class MD5Util {

    /***
     * MD5加码 生成32位md5码
     */
    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    public static String convertMD5(String inStr) {

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }
}