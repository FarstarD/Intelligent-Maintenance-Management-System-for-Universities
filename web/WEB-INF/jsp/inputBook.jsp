
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="ccc.jsp"%>

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <style>
        #sayProblem{
            width: 300px;
            height: 50px;
            resize: none;
        }
    </style>

    <form action="${pageContext.request.contextPath}/books/inputBooks">
        <input type="hidden" name="bookState" value="未处理">
        <input type="hidden" name="finishName" value="null">
        <input type="hidden"  name="finishTime" id="finishTime">
        <input type="hidden" name="end" value="null">
        <input type="hidden" name="inputName" id="inputName" value="${inputName}" >
        <p>联系电话: <input type="text" name="phone" required > </p>
        <p>维修的设备: <input type="text" name="maintainThing" required>  </p>
        <p>维修设备的总数量: <input type="number" name="maintainNum" min="1"> </p>
        <p>维修设备的地址: <input type="text" name="bookAddress" required> </p>
        <p>提交表单时间: <input type="date" name="inputTime" id="inputTime"></p>
        描述设备问题:
        <textarea name="sayProblem" id="sayProblem"></textarea>
        <p><input type="submit" value="提交" > <input type="reset" value="重置"></p>

    </form>


</section>
<%@include file="foot.jsp" %>
