
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        function oe() {
            $.post({
                url:"${pageContext.request.contextPath}/user/notAgain",
                data:{
                    "userName" :$("#userName").val()
                },
                success:function (data) {
                    if (data.toString()=="ok"){
                        $("#houzhui4").html("OK");
                        $("#houzhui4").css("color","green")
                    }else {
                        $("#houzhui4").html("已存在");
                        $("#houzhui4").css("color","red")
                    }
                }
            })
        }

        function ow() {
            $.post({
                url:"${pageContext.request.contextPath}/user/notBugAgain",
                data:{
                    "userLogin":$("#userLogin").val()
                },
                success:function (data) {
                    if (data.toString()=="ok" ){

                        $("#houzhui3").html("OK");
                        $("#houzhui3").css("color","green")
                    }else {
                        $("#houzhui3").html("已存在");
                        $("#houzhui3").css("color","red")
                    }
                }
            })
        }

        function x() {
            var userPwd = $("#userPwd").val();
            var newPwd = $("#newPwd").val();
            if (userPwd == newPwd){
                $("#houzhui6").html("OK");
                $("#houzhui6").css("color","green")
            }else {
                $("#houzhui6").html("不相同");
                $("#houzhui6").css("color","red")
            }
        }
        function yy() {
           var password1 = $("#password1").val();
           if (password1 == null || password1 == ''){
               $("#houzhui5").html("null");
               $("#houzhui5").css("color","red")
           }
        }
        function xx() {
           var userName1 = $("#userName").val();
           if (userName1 == null || userName1 == ''){
               $("#houzhui4").html("null");
               $("#houzhui4").css("color","red")
           }
        }
        function zz() {
           var userLogin1 = $("#userLogin1").val();
           if (userLogin1 == null || userLogin1 == ''){
               $("#houzhui3").html("null");
               $("#houzhui3").css("color","red")
           }
        }
    </script>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zhuce.css">
</head>
<body>
<img src="${pageContext.request.contextPath}/images/login/loginImage.png" alt=""  class="tu"   >
<div class="wrap">


    <br>
    <form action="${pageContext.request.contextPath}/user/Regist" method="post">
        <div >
            <div class="tushu">    <h1>   &nbsp; &nbsp; &nbsp;&nbsp;校园管理系统</h1></div>

        </div>

        <select name="userJob" id="" class="xiala">

            <option value="none" selected disabled hidden>请选择选项</option>
            <option  value ="学生">学生</option>
            <option  value ="老师">老师</option>
            <option  value ="维修员">维修员</option>

        </select>
        <br><br>
        姓名:<input   type="text" name="userName" class="name" id="userName"  placeholder=  " 请输入真实姓名" onfocus="xx()" onblur="oe()" required >
        <span id="houzhui4"></span>
        <br><br>
        账号:<input   type="text" name="userLogin" class="id" id="userLogin"  placeholder=  " 请输入登录账号"  onfocus="zz()"  onblur="ow()" required   >
        <span id="houzhui3"></span>
        <br>
        <br>
        密码:<input   type="password" name="userPwd" class="password" id="userPwd"  placeholder=  " 请输入登录密码" onfocus="yy()" onblur="x()"  required  >
        <span id="houzhui5"></span>
        <br><br>
        确认密码:<input   type="password" name="newPwd" class="password" id="newPwd"  placeholder=  " 确认密码"    onblur="x()" required   >
        <span id="houzhui6"></span>
        <br>
        <p class="sex">
            性别:
            <label><input name="userSex" type="radio" value="男"  required   />男  &nbsp; </label>
            &nbsp;
            <label><input name="userSex" type="radio"  value="女" required/>女 </label>
        </p>

        <br>
        电话:<input   type="text" name="userPhone" class="phone"   placeholder=  " 请输入联系电话"     required   >

        <br><br>
        <button class="login">注册</button>
    </form>
</div>
</body>
</html>
