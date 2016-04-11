package utils.endecrypt;


/**
 * Created by liguodong on 2016/4/10.
 */

public class XorUtils {

    private static char[] chs={'0','1','2','3','4','5','6','7','8','9','@',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
            'r','s','t','u','v','w','x','y','z','#',
            'A','B','C','D','E','F','G',
            'H','I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z','%'};


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



    //加密
    public static String Encrypt(String primalPassword){

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < primalPassword.length(); i++) {

            if(primalPassword.charAt(i)<='9'&&primalPassword.charAt(i)>='0'){
                stringBuilder.append(chs[primalPassword.charAt(i)-48+1]);
            }

            if(primalPassword.charAt(i)<='z'&&primalPassword.charAt(i)>='a'){
                stringBuilder.append(chs[primalPassword.charAt(i)-97+12]);
            }

            if(primalPassword.charAt(i)<='Z'&&primalPassword.charAt(i)>='A'){
                stringBuilder.append(chs[primalPassword.charAt(i)-65+39]);
            }
        }
        return stringBuilder.toString();
    }


    //解密
    public static String Decrypt(String primalPassword){

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < primalPassword.length(); i++) {

            if(primalPassword.charAt(i)<='9'&&primalPassword.charAt(i)>'0'){
                stringBuilder.append(chs[primalPassword.charAt(i)-49]);
            }


            if(primalPassword.charAt(i)<='z'&&primalPassword.charAt(i)>'a'){
                stringBuilder.append(chs[primalPassword.charAt(i)-98+11]);
            }

            if(primalPassword.charAt(i)<='Z'&&primalPassword.charAt(i)>'A'){
                stringBuilder.append(chs[primalPassword.charAt(i)-66+38]);
            }

            if(primalPassword.charAt(i)=='@'){
                stringBuilder.append('9');
            }

            if(primalPassword.charAt(i)=='#'){
                stringBuilder.append('z');
            }

            if(primalPassword.charAt(i)=='%'){
                stringBuilder.append('Z');
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



        /*System.out.println(EnDecrypt("7a642d326daa0bb88db5e39416ca138a", "[\bQA] \\\\Q"));
        System.out.println(EnDecrypt("c3284d0f94606de1fd2af172aba15bf3", "\u0002W_QZ"));
        System.out.println(EnDecrypt("b9be11166d72e9e3ae7fd407165e4bd2", "\u0010V\n\u0011"));*/
        String password = "09azAZ";
        System.out.println(XorUtils.Encrypt(password));
        System.out.println(XorUtils.Decrypt(XorUtils.Encrypt(password)));


    }




}
