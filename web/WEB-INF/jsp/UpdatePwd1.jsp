<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

<script>
    function wtf() {
        $.post({
            url:"${pageContext.request.contextPath}/user/UpdateNew",
            data:{
                "userLogin":$("#userLogin").val(),
                "oldPwd":$("#oldPwd").val()
            },
            success:function (data) {
                console.log(data);
                if (data.toString()=="ok"){
                    $("#houzhui").html("OK");
                    $("#houzhui").css("color","green")
                }else {
                    $("#houzhui").html("原密码不正确");
                    $("#houzhui").css("color","red")
                }
            }
        })

    }
    function validate() {
        var newPwd = $("#pwd1");
        var userPwd = $("#pwd2");

        if (newPwd.val() == userPwd.val()) {
            $("#tishi").html("两次密码相同");
            $("#tishi").css("color", "green");
        } else {
            $("#tishi").html("两次密码不相同,请重新输入");
            $("#tishi").css("color","red")

        }
    }
    function click1() {
        $.post({
            url:"${pageContext.request.contextPath}/user/xiuGaiPwd",
            data:{
                "userLogin":$("#userLogin"),
                "userPwd":$("#pwd2")
            }
        });

        alert("修改完成,返回登陆页面")
    }

</script>

<%--BootStrap美化界面--%>
<%@include file="ccc.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>密码修改页面</span>
    </div>

    <!--用户-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <form action="${pageContext.request.contextPath}/user/xiuGaiPwd" method="post" name="UpdatePwd_form">
            <p>登录账号: <input type="text" name="userLogin" id="userLogin" required></p>
            <p>
                旧密码: <input type="password" name="oldPwd" id="oldPwd" onblur="wtf()" required>
                <span id="houzhui"></span>
            </p>
            <p>新密码: <input type="password" name="newPwd" id="pwd1" required></p>
            <p>
                确认密码: <input type="password" name="userPwd" id="pwd2" onblur="validate()"  required>
                <span id="tishi"></span>
            </p>
            <p> <input type="submit" value="完成" class="passinbut" id="gaiPwd"></p>
            <p><input type="reset" value="重置"></p>

        </form>
    </table>
</div>
</section>

<%@include file="foot.jsp" %>

