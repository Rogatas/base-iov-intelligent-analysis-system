/**
 * Created by liguodong on 2016/4/4.
 */

$(document).ready(function(){


    $("#baseButton").click(function(){
        $("#basic_validate").submit();
    });

    $("#baseClear").click(function(){
        $("#nickname").val("");
        $("#email").val("");

    });


    $("#submitButton").click(function(){
        $("#password_validate").submit();
    });


    $("#submitClear").click(function(){
        $("#passwd").val("");
        $("#passwdConfirm").val("");
    });


});