/**
 * Created by liguodong on 2016/3/24.
 */



$(document).ready(function(){
    /*var path='${pageContext.request.contextPath }';*/


    $("#loginReset").click(function(){
        $("#username").val("");
        $("#password").val("");

    });

    $("#loginSubmit").click(function() {
        $("#loginform").submit();
    });

    /*$("#retrievePassword").click(function() {

        $("#recoverform").submit();
    });

    $("#retrieveReset").click(function(){
        $("#loseEmail").val("");
    });*/

});

