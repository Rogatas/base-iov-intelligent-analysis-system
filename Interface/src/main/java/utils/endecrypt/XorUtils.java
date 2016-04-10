package utils.endecrypt;


/**
 * Created by liguodong on 2016/4/10.
 */

public class XorUtils {

    private char[] chs={'1','2','3','4','5','6','7','8'};


    private XorUtils(){
    }


    /**
     * @param secretKey  密钥
     * @param primalPassword
     * @return
     */
    public static String EnDecrypt(String secretKey, String primalPassword){

        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;

        for (int i = 0; i < primalPassword.length(); i++) {

            stringBuilder.append((char)(secretKey.charAt(j++) ^ primalPassword.charAt(i)));
            if(j==secretKey.length()){
                j=0;
            }
        }
        return stringBuilder.toString();
    }




    /*public static String Decrypt(String secretKey,String EncryptPassword){


    }*/

    public static void main(String[] args) {
       /* String password = "c3284d0f94606de1fd2af172aba15bf3";
        String encryptPassword="admin";

        System.out.println(EnDecrypt(password, encryptPassword));

        System.out.println(EnDecrypt(password, EnDecrypt(password, encryptPassword)));


        String password2 = "b9be11166d72e9e3ae7fd407165e4bd2";
        String encryptPassword2="s";

        System.out.println(EnDecrypt(password2, encryptPassword2));

        System.out.println(EnDecrypt(password2, EnDecrypt(password2, encryptPassword2)));*/

        /////////////////////



        System.out.println(EnDecrypt("7a642d326daa0bb88db5e39416ca138a", "[\bQA] \\\\Q"));
        System.out.println(EnDecrypt("c3284d0f94606de1fd2af172aba15bf3", "\u0002W_QZ"));
        System.out.println(EnDecrypt("b9be11166d72e9e3ae7fd407165e4bd2", "\u0010V\n\u0011"));
    }




}
