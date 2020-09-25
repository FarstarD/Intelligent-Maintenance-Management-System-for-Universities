<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@include file="bb.jsp"%>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

<div class="right">
<div class="rightdiv2">
    <p  class="zi" >   &nbsp;&nbsp; 用户结果 </p>
    <div>
        <div>
            <form method="get" action="${pageContext.request.contextPath }/user/selectUser">
                <%--            <input name="method" value="query" class="input-text" type="hidden">--%>
                    <span>用户名：</span>
                    <input name="userLogin" class="input-text"	type="text" >
                <select name="userJob">
                    <option value="none" selected disabled hidden>请选择选项</option>
                    <option  value ="学生">学生</option>
                    <option  value ="老师">老师</option>
                    <option  value ="维修员">维修员</option>
                </select>
                    <input type="hidden" name="pageIndex" value="1"/>
                    <input	value="查 询" type="submit" id="searchbutton">
                <a href="${pageContext.request.contextPath}/user/newUser" >添加用户</a>
                <a href="${pageContext.request.contextPath}/user/queryAllUser">显示全部用户</a>
            </form>

        </div>

    </div>

    <br><br><br>
    <table    border="1" align="center"  cellpadding='20' cellspacing = '0'  >
        <tr class="ditr">
            <th >ID</th>
            <th >姓名</th>
            <th >登录账号</th>
            <th >登录密码</th>
            <th >性别</th>
            <th >身份</th>
            <th >电话</th>
            <th >操作</th>
        </tr>
<c:forEach var="user" items="${list}" varStatus="status">
        <tr>
            <td>
                <span>${user.userID }</span>
            </td>
            <td>
                <span>${user.userName }</span>
            </td>
            <td>
                <span>${user.userLogin}</span>
            </td>
            <td>
                <span>${user.userPwd}</span>
            </td>
            <td>
                <span>${user.userSex}</span>
            </td>
            <td>
                <span>${user.userJob}</span>
            </td>
            <td>
                <span>${user.userPhone}</span>
            </td>
            <td>
                <span><a class="viewUser" href="${pageContext.request.contextPath}/user/selectUser?userLogin=${user.userLogin}"><img src="${pageContext.request.contextPath }/images/read.png" alt="查看" title="查看"/></a></span>
                <span><a class="modifyUser" href="${pageContext.request.contextPath}/user/toSyUpdateUser?userLogin=${user.userLogin}"><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/></a></span>
                <span><a class="deleteUser" href="${pageContext.request.contextPath}/user/deleteUser?userID=${user.userID}"><img src="${pageContext.request.contextPath }/images/schu.png" alt="删除" title="删除"/></a></span>
            </td>
        </tr>
</c:forEach>
    </table>
</div>

</div>
</div>
</section>
<%@include file="foot.jsp"%>

