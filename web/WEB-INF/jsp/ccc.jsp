
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录成功</h1>
<h1>用户界面</h1>
<a href="${pageContext.request.contextPath}/user/goOut">注销</a>
<a href="${pageContext.request.contextPath}/user/toUpdatePwd">修改密码</a>
<a href="${pageContext.request.contextPath}/books/toInputBooks">上传维修表</a>
<a href="${pageContext.request.contextPath}/books/baoXiu">报修记录</a>
</body>
</html>
===============--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>维修管理系统</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/public.css" />
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>维修管理系统</h1>
    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> ${userSession}</span> , 欢迎你！</p>
        <a href="${pageContext.request.contextPath}/user/goOut">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2020年1月1日 11:11  星期一</span>
    <%--    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>--%>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="${pageContext.request.contextPath}/books/toInputBooks">上传维修表</a></li>
                <li><a href="${pageContext.request.contextPath}/books/baoXiu">报修记录</a></li>
                <li><a href="${pageContext.request.contextPath}/user/toUpdatePwd">修改密码</a></li>
                <li><a href="${pageContext.request.contextPath}/user/goOut">注销</a></li>
            </ul>
        </nav>
    </div>
