<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@include file="bbb.jsp"%>
<form action="${pageContext.request.contextPath}/user/Regist" method="post">
    <p> 真实姓名: <input type="text" name="userName" placeholder="请输入真实姓名" required></p>
    <p> 登录账号: <input type="text" name="userLogin" placeholder="请输入登录账号" required></p>
    <p> 登录密码: <input type="password" name="userPwd" placeholder="请输入登录密码" required></p>
    <p>
        性别: <label><input name="userSex" type="radio" value="男" required />男 </label>
        ||
        <label><input name="userSex" type="radio"  value="女" required/>女 </label></p>
    <p>
        身份:<select name="userJob" required >
        <option value="none" selected disabled hidden>请选择选项</option>
        <option  value ="学生">学生</option>
        <option  value ="老师">老师</option>
        <option  value ="维修员">维修员</option>
    </select>
    </p>
    <p> 联系电话: <input type="text" name="userPhone" placeholder="请输入联系电话" required></p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
        <a href="${pageContext.request.contextPath}/user/queryAllUser"><input type="button" value="返回"></a>
    </p>
</form>

<%@include file="foot.jsp" %>
