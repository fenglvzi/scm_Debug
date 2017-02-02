<%--
  Created by IntelliJ IDEA.
  User: 张译文
  Date: 2017/2/1
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/dept/success.action" id="testShow" method="post">
    请输入要查询的id号：<input name="deptId" type="text"><br>
    <input type="submit" value="点我">
</form>

</body>
</html>
