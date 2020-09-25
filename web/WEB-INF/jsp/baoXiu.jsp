
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@include file="ccc.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>报修记录页面</span>
    </div>

    <!--用户-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <th>提交用户</th>
            <th>提交人联系电话</th>
            <th>维修的设备</th>
            <th>描述设备问题</th>
            <th>维修设备的总数量</th>
            <th>维修设备的地址</th>
            <th>提交表单时间</th>
            <th>完成表单时间</th>
            <th>表单状态</th>
        </tr>
        <c:forEach var="books" items="${list6}" varStatus="status">
            <tr>
                <td>
                    <span>${books.inputName }</span>
                </td>
                <td>
                    <span>${books.phone }</span>
                </td>
                <td>
                    <span>${books.maintainThing}</span>
                </td>
                <td>
                    <span>${books.maintainNum}</span>
                </td>
                <td>
                    <span>${books.sayProblem}</span>
                </td>
                <td>
                    <span>${books.bookAddress}</span>
                </td>
                <td>
                    <span>${books.inputTime}</span>
                </td>
                <td>
                    <span>${books.finishTime}</span>
                </td>
                <td>
                    <span>${books.bookState}</span>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</section>

<%@include file="foot.jsp" %>


