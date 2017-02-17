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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/fullcalendar.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-style.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-media.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/jquery.gritter.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/font-awesome/css/font-awesome.css" />

  <!--me-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/main.css" />
</head>

<body>
  <!--logo-->
  <div id="header">
    <h1><a>基于车联网OBD行车数据报表系统的设计与实现</a></h1>
  </div>

<!--顶部菜单-->
<!--用户，设置，登出-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" >
      <a title=""  data-toggle="dropdown"
         data-target="#profile-messages"
         class="dropdown-toggle">
        <i class="icon icon-user"></i>
        <span class="text">${username}</span>
        <b class="caret"></b>
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
<!--结束顶部菜单-->


<!--左侧菜单栏-->
<!--sidebar-menu-->
<div id="sidebar">
  <a class="visible-phone">
    <i class="icon icon-home">
    </i> main</a>
  <ul>

    <li class="active">
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
<!--sidebar-menu-->



<!--主要的内容部分-->
<!--main-container-part-->
<div id="MainFrame">
  <!--breadcrumbs-->
  <div id="MainFrame-header">
    <div id="breadcrumb">
      <a title="Home" class="tip-bottom">
        <i class="icon-home"></i> 主页 </a>
    </div>
  </div>
  <!--End-breadcrumbs-->

  <!--Action boxes-->
  <!--
    <div class="container-fluid">

    <img src="img/car.jpg"  />
    <span style="position:absolute; left:250px; top:50%;" >这里显示文字</span>
    </div>
    -->
  <div class="banner">
    <ul class="texts">
      <!--violet 紫色 -->
      <p style="color:#FFCBE4;font-size:40px;font-family:Times New Roman"><b>Creative change life,IOT change world.</b></p>
    </ul>
  </div>
</div>

<!--end-main-container-part-->


<script src="${pageContext.request.contextPath}/page/frame/js/excanvas.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.ui.custom.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.peity.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.dashboard.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.gritter.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.interface.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.chat.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.validate.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.form_validation.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.wizard.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.uniform.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/select2.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.popover.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.tables.js"></script>

</body>
</html>


