<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>手机登陆页面</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/phone/html/style.css" >
</head>

<body id="app">
<div>
    <div id="title">
        <img src="${pageContext.request.contextPath}/phone/images/Tittle.png" alt="">
    </div>
    <div id="body">
        <form action="${pageContext.request.contextPath}/user/phoneLogin">
            <input type="text" name="userName" placeholder="请输入姓名">
            <input type="text" name="userLogin" placeholder="请输入账号">
            <input type="text" name="userPwd" placeholder="请输入密码">

            <input type="submit" value="登 &nbsp; 录">
        </form>

        <a href="${pageContext.request.contextPath}/user/toPhoneRegist" >没有账号？点击注册</a>
    </div>


</div>
</body>