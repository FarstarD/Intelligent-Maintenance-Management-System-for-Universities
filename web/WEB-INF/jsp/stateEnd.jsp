<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="ddd.jsp"%>


<link rel="stylesheet" href="${pageContext.request.contextPath}/css/weixiu.css">

<div class="right">

    <div class="rightdiv" >
        <p  class="zi" >   &nbsp;&nbsp; 已完成表单 </p>
        <form action="${pageContext.request.contextPath}/books/statEnd">
            <input type="hidden" name="bookState" value="已完成">
            <input type="submit" value="显示所有表单" id="btn1">
        </form>

        <table    border="1" align="center"  cellpadding='20' cellspacing = '0'  >
            <tr >
                <th>表单ID</th>
                <th>提交用户</th>
                <th>维修的设备</th>
                <th>维修设备的总数量</th>
                <th>描述设备问题</th>
                <th>维修设备的地址</th>
                <th>表单状态</th>

            </tr>

            <c:forEach var="books" items="${list3}" varStatus="status">
                <tr>
                    <td>
                        <span>${books.bookID }</span>
                    </td>
                    <td>
                        <span>${books.inputName }</span>
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
                        <span>${books.bookState}</span>
                    </td>

                </tr>
            </c:forEach>
        </table>
    </div>
    <!-- 上面这个div是整个查询表框的结束div -->
</div>

</section>
<%@include file="foot.jsp" %>
