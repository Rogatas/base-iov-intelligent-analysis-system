<%@ page language="java"  import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
  <title>基于车联网OBD行车数据报表系统的设计与实现</title>

  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-style.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/css/matrix-media.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/page/frame/font-awesome/css/font-awesome.css" />

  <style type="text/css">
    #container {
      height: 600px;
      min-width: 310px;
      max-width: 800px;
      margin: 0 auto;
    }
  </style>

</head>
<body>

  <!--Header-part-->
  <div id="header">
    <h1><a>基于车联网OBD行车数据报表系统的设计与实现</a></h1>
  </div>
  <!--close-Header-part-->

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



<!--sidebar-menu-->
<div id="sidebar">
  <a href="#" class="visible-phone">
  <i class="icon icon-signal"></i>
  车辆参数极值统计</a>
  <ul>
    <li >
      <a href="${pageContext.request.contextPath}/login/main.do">
        <i class="icon icon-home"></i>
        <span>主页</span></a>
    </li>
    <li  >
      <a href="${pageContext.request.contextPath}/catalog/vinDimensionCount.do" >
        <i class="icon icon-signal"></i>
        <span>VIN码各维度统计</span>
      </a>
    </li>

    <li class="active">
      <a href="${pageContext.request.contextPath}/catalog/vehicleMaxCount/index.do">
      <i class="icon icon-inbox">
      </i>
      <span>车辆参数极值统计</span></a>
    </li>


    <li><a href="${pageContext.request.contextPath}/catalog/percentageCount/index.do">
      <i class="icon icon-th"></i>
      <span>车辆参数范围占比统计</span></a>
    </li>

    <li><a href="${pageContext.request.contextPath}/catalog/vehicleEngineLoadRange/index.do">
      <i class="icon icon-fullscreen"></i>
      <span>引擎转速范围统计</span></a>
    </li>

    <li class="submenu">
      <a href="#"><i class="icon icon-th-list"></i>
        <span>Forms</span> <span class="label label-important">3</span>
      </a>
      <ul>
        <li><a href="form-common.html">Basic Form</a></li>
        <li><a href="form-validation.html">Form with Validation</a></li>
        <li><a href="form-wizard.html">Form with Wizard</a></li>
      </ul>
    </li>

    <li><a href="buttons.html">
      <i class="icon icon-tint"></i>
      <span>Buttons &amp; icons</span></a>
    </li>

    <li>
      <a href="interface.html">
      <i class="icon icon-pencil"></i>
      <span>Eelements</span></a>
    </li>


  </ul>
</div>


<div id="content">

  <div id="content-header">
    <div id="breadcrumb">
      <a href="${pageContext.request.contextPath}/login/main.do"
         title="Go to Home" class="tip-bottom">
        <i class="icon-home"></i> 主页 </a>
      <a class="current">车辆参数极值统计</a>
    </div>
  </div>


  <div class="container-fluid">

    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title">
            <span class="icon">
              <i class="icon-signal"></i>
            </span>
            <h5>极值统计</h5>
          </div>

          <div class="widget-content">


            <div id="container" style="height: 400px">
            </div>

          </div>
        </div>
      </div>
    </div>

  </div>
</div>

  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.pie.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.resize.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.peity.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/highcharts.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/highcharts-3d.js"></script>

  <script type="text/javascript" src="${pageContext.request.contextPath}/page/dev/js/content/vehicle_max_count.js"></script>

  <script type="text/javascript">

    var getContextPath = '${pageContext.request.contextPath}';

  </script>

</body>
</html>
