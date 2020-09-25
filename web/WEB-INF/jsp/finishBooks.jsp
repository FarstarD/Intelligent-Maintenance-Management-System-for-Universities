
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>完善信息</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>填写维修表</title>

    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>


    <style>
        #end{
            width: 300px;
            height: 50px;
            resize: none;
        }
    </style>

</head>
<body>

<form action="${pageContext.request.contextPath}/books/inputNameAndState">
    <input type="hidden" name="bookState" value="${bookState}">
    <input type="hidden" name="inputName" value="${inputName}">


    <p>维修用户: <input type="text" name="finishName" id="finishName" max="10" required></p>
    <p>提交表单时间: <input type="date" name="finishTime" id="finishTime"></p>
    <p>
        描述设备问题:
        <textarea name="end" id="end" ></textarea>
    </p>
    <p><input type="submit" value="提交" > <input type="reset" value="重置"></p>
</form>
</body>
</html>

</body>
</html>
