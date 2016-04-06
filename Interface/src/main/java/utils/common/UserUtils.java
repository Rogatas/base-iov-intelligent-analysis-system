package utils.common;

import com.lgd.model.pojo.UserLoginInformation;

import javax.servlet.http.HttpSession;

/**
 * Created by liguodong on 2016/4/6.
 */

public class UserUtils {

    private UserUtils(){}


    //获取用户名或昵称
    public static String getNikeOrUserName(HttpSession session,String attribute){

        Object user = session.getAttribute(attribute);
        UserLoginInformation userLoginInformation = (UserLoginInformation)user;

        return getNikeOrUserName(userLoginInformation);
    }

    public static String getNikeOrUserName(UserLoginInformation userLoginInformation){
        //先查找昵称，看是否存在，如果存在，保存昵称，如果不存在，保存用户名。
        if(userLoginInformation.getNickname()!=null
                && !userLoginInformation.getNickname().equals("")){
            return userLoginInformation.getNickname();
        }else {
            return userLoginInformation.getUsername();
        }
    }







}
