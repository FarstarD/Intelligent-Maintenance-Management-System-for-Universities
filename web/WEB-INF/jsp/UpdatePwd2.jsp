<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/humancenter.css">

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

</script>

<%--BootStrap美化界面--%>
<%@include file="ddd.jsp"%>

<!--用户-->
<div class="right">
    <div class="rightdivcg" ><p  class="zixiugai" >   &nbsp;&nbsp; 修改密码 </p>

        <form action="${pageContext.request.contextPath}/user/xiuGaiPwd" method="post" name="UpdatePwd_form">
            <input type="hidden" name="userLogin" id="userLogin" value="${userLoginInfo}">
            <p  class="p">
                <span class="text" >旧密码:</span> &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="input" name="userPwd" id="oldPwd" onblur="wtf()" required>
                <span id="houzhui"></span>
            </p>
            <p  >
                <span  class="text" >新密码:</span> &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="input" name="newPwd" id="pwd1" required>
            </p>
            <p  >
                <span  class="text" >确认密码&nbsp;:</span> <input type="text" class="input" id="pwd2" name="newPwd1" onblur="validate()"  required>
                <span id="tishi"></span>
            </p>

            <button> <span>保存</span> </button>  <button> <span>重置</span> </button>
        </form>
    </div>
</div>

</section>

<%@include file="foot.jsp" %>

