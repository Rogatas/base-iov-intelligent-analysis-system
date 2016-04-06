<%@ page language="java"  import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
  <title>基于车联网OBD行车数据报表系统的设计与实现</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="/page/frame/css/bootstrap.min.css" />
  <link rel="stylesheet" href="/page/frame/css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="/page/frame/css/matrix-login.css" />
  <link rel="stylesheet" href="/page/frame/font-awesome/css/font-awesome.css"  />

</head>

<body>

<div id="loginbox">


  <%--账号和密码--%>
  <form id="loginform" class="form-vertical"
        action="${pageContext.request.contextPath}/login/passwdauth.do"
        method="post"
          >
    <div class="control-group normal_text">
      <h3><img src="/page/frame/img/logo.jpg" alt="Logo" />
      </h3>
    </div>

    <div class="control-group">
      <div class="controls">
        <div class="main_input_box">
                        <span class="add-on bg_lg">
                            <i class="icon-user"></i>
                        </span>
          <input id="username" name="username"
                 type="text" placeholder="Username" value="${msg }" />
        </div>
      </div>
    </div>

    <div class="control-group">
      <div class="controls">
        <div class="main_input_box">
                        <span class="add-on bg_ly">
                            <i class="icon-lock"></i>
                        </span>
          <input id="password" name="password" type="password" placeholder="Password" />
        </div>
      </div>
    </div>

    <div class="form-actions">
        <span class="pull-left">
            <a href="#" class="flip-link btn btn-info" id="to-recover">Lost password?</a>
        </span>



        <span class="pull-right">
            <a id="loginSubmit" type="submit" class="btn btn-success" /> Login
          </a>
        </span>

        <span class="pull-right">
            <a id="loginReset" type="button"  class="btn btn-danger" /> Reset
            </a>
        </span>
    </div>
  </form>

  <%--找回密码--%>
  <form id="recoverform" action="#" class="form-vertical">
    <p class="normal_text">Enter your e-mail address below and
      we will send you instructions how to recover a password.
    </p>

    <div class="controls">
      <div class="main_input_box">
                    <span class="add-on bg_lo">
                        <i class="icon-envelope"></i>
                    </span><input type="text" placeholder="E-mail address" />
      </div>
    </div>

    <div class="form-actions">
                <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">
                  &laquo; Back to login</a>
                </span>
                <span class="pull-right">
                    <a class="btn btn-info"/>
                    Reecover</a>
                </span>
    </div>
  </form>

</div>

<script type="text/javascript" src="/page/frame/js/jquery.min.js"></script>
<script type="text/javascript" src="/page/frame/js/matrix.login.js"></script>
<script type="text/javascript" src="/page/dev/js/catalog/login.js"></script>


<%--<script type="text/javascript">
    $(function(){
        var flag = '${msg}';
        if(flag != ''){
            alert(flag);
        }
    });
</script>--%>

</body>

</html>