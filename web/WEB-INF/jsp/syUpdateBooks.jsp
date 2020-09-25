<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="bb.jsp"%>

<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<style>
    #sayProblem{
        width: 300px;
        height: 50px;
        resize: none;
    }
</style>

<form action="${pageContext.request.contextPath}/books/updateByBookID">
    <input type="hidden" name="bookID" value="${bookID1}">
    <p>提交姓名:<input type="text" name="inputName" id="inputName" value=${inputName1}></p>
    <p>联系电话: <input type="text" name="phone" value=${phone1}></p>
    <p>维修的设备: <input type="text" name="maintainThing" value=${maintainThing1}></p>
    <p>维修设备的总数量: <input type="number" name="maintainNum" min="1" value=${maintainNum1}> </p>
    <p>维修人员:<input type="text" name="finishName" value=${finishName1}></p>
    <p>维修设备的地址: <input type="text" name="bookAddress" value=${bookAddress1}></p>
<%--    <p> <input type="text" name="inputTime" id="inputTime" value=${inputTime1}></p>
    <p> <input type="text"  name="finishTime" id="finishTime" value=${finishTime1}></p>--%>
    <p>
        表单状态:<select name="bookState" required >
            <option value="none" selected disabled hidden>${bookState1}</option>
            <option  value ="未处理">未处理</option>
            <option  value ="正在处理">正在处理</option>
            <option  value ="已完成">已完成</option>
        </select>
    </p>
    描述设备问题:
    <textarea name="sayProblem" id="sayProblem" >${sayProblem1}</textarea>
    <p>维修结果描述<input type="text" name="end" value="${end1}"></p>
    <p><input type="submit" value="提交" > <input type="reset" value="重置"></p>

</form>


</section>
<%@include file="foot.jsp" %>