<%--
  Created by IntelliJ IDEA.
  User: liguodong
  Date: 2016/4/3
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <title>基于车联网OBD行车数据报表系统的设计与实现</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/uniform.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/select2.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-style.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-media.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/font-awesome/css/font-awesome.css"  />
</head>

<body>

<!--Header-part-->
<div id="header">
  <h1><a >基于车联网OBD行车数据报表系统的设计与实现</a></h1>
</div>
<!--close-Header-part-->


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">

  <ul class="nav">

    <li  class="dropdown" id="profile-messages" >
      <a title="" href="#" data-toggle="dropdown" data-target="#profile-messages"
         class="dropdown-toggle">
        <i class="icon icon-user"></i>
        <span class="text">${username}</span>
        <b class="caret">
        </b>
      </a>
    </li>



    <!--修改密码-->
    <li class="">
      <a title="" href="${pageContext.request.contextPath}/login/settings.do">
        <i class="icon icon-cog"></i>
        <span class="text">设置</span>
      </a>
    </li>

    <!--返回登录界面-->
    <li class="">
      <a title="" href="${pageContext.request.contextPath}/login/logout.do" >
        <i class="icon icon-share-alt"></i>
        <span class="text">退出</span></a>
    </li>

  </ul>
</div>


<!--sidebar-menu-->

<div id="sidebar">
  <a href="#" class="visible-phone">
    <i class="icon icon-list"></i>
    settings</a>
  <ul>

    <li >
      <a href="${pageContext.request.contextPath}/login/main.do">
        <i class="icon icon-home"></i>
        <span>主页</span></a>
    </li>

    <li>
      <a href="${pageContext.request.contextPath}/catalog/vinDimensionCount.do" >
        <i class="icon icon-signal"></i>
        <span>VIN码各维度统计</span>
      </a>
    </li>

    <li>
      <a href="${pageContext.request.contextPath}/catalog/vehicleMaxCount/index.do">
        <i class="icon icon-inbox">
        </i>
        <span>车辆参数极值统计</span></a>
    </li>

    <li>
      <a href="${pageContext.request.contextPath}/catalog/vehicleRangePercentCount/index.do">
        <i class="icon icon-th"></i>
        <span>车辆参数范围占比统计</span>
      </a>
    </li>

    <li><a href="${pageContext.request.contextPath}/catalog/recentEngineSpeedRange/index.do">
      <i class="icon icon-fullscreen"></i>
      <span>引擎转速范围统计</span></a>
    </li>

    <%--<li class="submenu active">--%>
    <li class="submenu">
      <a >
        <i class="icon icon-th-list"></i>
        <span>汽车ID维度的参数统计</span>
        <span class="label label-important">3</span></a>

      <ul>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleInner/index/max.do">最大值</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleInner/index/average.do">均值</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleInner/index/min.do">最小值</a></li>
      </ul>
    </li>

    <li class="submenu">
      <a >
        <i class="icon icon-file"></i>
        <span>日期维度的参数范围统计</span>
        <span class="label label-important">5</span></a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleTime/index/oilWear.do">油耗</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleTime/index/intakeTem.do">进气温度</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleTime/index/airFlow.do">空气流量</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleTime/index/batteryVoltage.do">电瓶电压</a></li>
        <li><a href="${pageContext.request.contextPath}/catalog/baseInfoVehicleTime/index/coolantTem.do">冷却液水温</a></li>
      </ul>
    </li>

  </ul>
</div>

<div id="content">
  <div id="content-header">
    <div id="breadcrumb">
      <a title="Go to Home" class="tip-bottom"
         href="${pageContext.request.contextPath}/login/main.do">
        <i class="icon-home"></i>
        主页
      </a>
      <a class="current">设置</a>
    </div>
  </div>

  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title">
            <span class="icon"> <i class="icon-info-sign"></i> </span>
            <h5>修改基本信息</h5>
          </div>

          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post"
                  action="${pageContext.request.contextPath}/settings/base/info.do"
                  name="basic_validate"
                  id="basic_validate" novalidate="novalidate">
              <div class="control-group">
                <label class="control-label">Your NickName</label>
                <div class="controls">
                  <input type="text" name="nickname" id="nickname" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Your Email</label>
                <div class="controls">
                  <input type="text" name="email" id="email" />
                </div>
              </div>

              <p align="center" style="font-family:arial;
				color:Tomato;font-size:16px;">${msgInfo}</p>


              <div class="form-actions">
                <input id="baseButton" type="submit"
                       value="Validate" class="btn btn-success">
                <input id="baseClear" type="button"
                       value="Clear" class="btn btn-info">
              </div>

            </form>

          </div>
        </div>
      </div>
    </div>


    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title">
			<span class="icon"> <i class="icon-info-sign"></i>
			</span>
            <h5>设置密码</h5>
          </div>
          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post"
                  action="${pageContext.request.contextPath}/settings/modify/password.do"
                  name="password_validate"
                  id="password_validate" novalidate="novalidate">

              <div class="control-group">
                <label class="control-label">Password</label>
                <div class="controls">
                  <input type="password" name="passwd" id="passwd"/>
                </div>
              </div>

              <div class="control-group">
                <label class="control-label">Confirm password</label>
                <div class="controls">
                  <input  type="password"
                         name="passwdConfirm" id="passwdConfirm" />
                </div>
              </div>
              <p align="center" style="font-family:arial;
				color:Tomato;font-size:16px;"> ${msgPasswd}</p>
              <div class="form-actions">
                <input id="submitButton" type="submit"
                       value="Validate" class="btn btn-success">
                <input id="submitClear" type="button"
                       value="Clear" class="btn btn-info">
              </div>

            </form>
          </div>
        </div>
      </div>
    </div>

  </div>
</div>

  <script src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/jquery.ui.custom.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/jquery.uniform.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/select2.min.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/jquery.validate.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/matrix.js"></script>
  <script src="${pageContext.request.contextPath}/page/frame/js/matrix.form_validation.js"></script>
  <script src="${pageContext.request.contextPath}/page/dev/js/catalog/settings.js"></script>


</body>
</html>

