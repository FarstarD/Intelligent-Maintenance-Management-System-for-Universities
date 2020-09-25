
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%--BootStrap美化界面--%>
<%@include file="bb.jsp"%>
<div class="right">
    <!-- 上面这个div是整个查询表框的结束div -->
    <div class="rightdiv2">
        <p  class="zi" >   &nbsp;&nbsp; 汇总结果 </p>

        <div>
            <div>
                <form method="get" action="${pageContext.request.contextPath }/books/selectSumBooks" >
                    <span>维修的设备：</span>
                    <input name="maintainThing" class="input-text"	type="text">

                    <input	value="查 询" type="submit" id="searchbutton">
                    <%--            <a href="${pageContext.request.contextPath}/user/newUser" >添加用户</a>--%>
                </form>
                <form action="${pageContext.request.contextPath}/books/baoBiao">
                    <span class="input-text">从:<input type="date" name="inputTime">到: <input type="date" name="finishTime">的记录;
                    <input type="submit" value="提交">
                    </span>
                </form>
            </div>
        </div>

        <br><br><br>
        <table    border="1" align="center"  cellpadding='20' cellspacing = '0'  >
            <tr class="ditr">
                <th>维修的设备</th>
                <th>维修设备的总数量</th>
                <th>提交时间</th>
                <th>完成时间</th>
            </tr>
            <c:forEach var="BaoBiao" items="${list7}" >
                <tr>
                <tr>
                    <td>
                        <span>${BaoBiao.maintainThing }</span>
                    </td>
                    <td>
                        <span>${BaoBiao.main_num }</span>
                    </td>
                    <td>
                        <span>${BaoBiao.inputTime}</span>
                    </td>
                    <td>
                        <span>${BaoBiao.finishTime}</span>
                    </td>

                </tr>
                </tr>
            </c:forEach>
        </table>

    </div>

</div>
</div>

</section>
<%@include file="foot.jsp"%>


