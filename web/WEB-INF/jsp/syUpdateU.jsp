<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="bb.jsp" %>
<form action="${pageContext.request.contextPath}/user/syUpdateUser" method="post">
    <p>姓名: <input type="text" name="userName" placeholder="请输入需要修改的姓名" required></p>
     <input type="hidden" name="userLogin" value="${userLogin}">
   <p>登录密码: <input type="password" name="userPwd" placeholder="请输入需要修改的密码" required></p>
    <p>
        性别: <label><input name="userSex" type="radio" value="男" required />男 </label>
        ||
        <label><input name="userSex" type="radio"  value="女" required/>女 </label>
    </p>
   <p>
       身份:
       <select name="userJob" required >
           <option value="none" selected disabled hidden>请选择选项</option>
           <option  value ="学生">学生</option>
           <option  value ="老师">老师</option>
           <option  value ="维修员">维修员</option>
       </select>
   </p>

    <p>联系电话: <input type="text" name="userPhone" placeholder="请输入联系电话" required></p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>
</form>

<%@include file="foot.jsp" %>



