<%--
  Created by IntelliJ IDEA.
  User: liguodong
  Date: 2016/4/3
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
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
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a>基于车联网OBD行车数据报表系统的设计与实现</a></h1>
</div>
<!--close-Header-part-->

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" >
      <a title="" href="#" data-toggle="dropdown"
         data-target="#profile-messages" class="dropdown-toggle">
        <i class="icon icon-user"></i>
        <span class="text">Welcome User</span>
        <b class="caret"></b>
      </a>
    </li>

    <li class=""><a title="" href="#">
      <i class="icon icon-cog"></i> <span class="text">Settings</span></a>
    </li>

    <li class=""><a title="" href="login.html">
      <i class="icon icon-share-alt"></i>
      <span class="text">Logout</span></a></li>
  </ul>
</div>



<!--sidebar-menu-->
<div id="sidebar"> <a href="#" class="visible-phone">
  <i class="icon icon-signal"></i> Charts &amp; graphs</a>
  <ul>
    <li><a href="index.html">
      <i class="icon icon-home"></i> <span>主页</span></a> </li>
    <li class="active">
      <a href="charts.html"><i class="icon icon-signal"></i>
        <span>VIN码各维度统计</span></a>
    </li>

    <li> <a href="widgets.html"><i class="icon icon-inbox"></i>
      <span>Widgets</span></a> </li>
    <li><a href="tables.html"><i class="icon icon-th"></i>
      <span>Tables</span></a></li>
    <li><a href="grid.html"><i class="icon icon-fullscreen"></i>
      <span>Full width</span></a>
    </li>
    <li><a href="buttons.html">
      <i class="icon icon-tint"></i>
      <span>Buttons &amp; icons</span></a></li>
    <li><a href="interface.html">
      <i class="icon icon-pencil"></i>
      <span>Eelements</span></a>
    </li>


  </ul>
</div>

<div id="content">

  <div class="container-fluid">

    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-signal"></i> </span>
            <h5>维度统计</h5>
          </div>
          <div class="widget-content">

            <div id="container"
                 style="min-width: 310px; height: 400px; margin: 0 auto">
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
</div>


<script src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.pie.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.charts.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/jquery.peity.min.js"></script>
<script src="${pageContext.request.contextPath}/page/frame/js/matrix.dashboard.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/page/frame/js/highcharts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/page/dev/js/content/vin_dimension_count.js"></script>

</body>
</html>
