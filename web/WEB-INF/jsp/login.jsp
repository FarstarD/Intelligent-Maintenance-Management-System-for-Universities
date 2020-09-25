<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<script>

</script>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>系统登录 - 维修管理系统</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">

</head>
<body >
<img src="${pageContext.request.contextPath}/images/login/loginImage.png" class="tu">
<div class="wrap">

    <br>
    <form action="${pageContext.request.contextPath }/user/login" method="post" name="form0">
        <div >
            <div class="tushu">    <h1>   &nbsp; &nbsp; &nbsp;&nbsp;校园管理系统</h1></div>
            <input   type="text" name="userName" class="name"   placeholder=  " 请输入真实姓名"        >
        </div>

        <br>
        <br>

        <div >
            <input   type="text" name="userLogin" class="id" placeholder=  " 请输入账号">
        </div>
        <br>
        <br>
        <div >
            <input   type="password" name="userPwd" class="password" placeholder=  " 请输入密码">
        </div>

        <br>
        <br>
        <br>
        <br>

        <div >
            <button class="login" type="submit"  id="send0">登录</button>  &nbsp;  &nbsp;  &nbsp;  &nbsp;
            <a href="${pageContext.request.contextPath}/user/toRegist">未有账号,请注册？</a>
        </div>

    </form>
</div>
</body>
</html>