<%--
  Created by IntelliJ IDEA.
  User: felix
  Date: 2/19/2021
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <h2>Hello World of Spring!</h2>
    <br><br>
    <label>
        Student Name: <b>${param.studentName}</b>
    </label>
    <br><br>
    <label>
        Message: ${message}
    </label>
    <br><br>
    <label>
        <a href="${pageContext.servletContext.contextPath}/">Back to Menu</a>
    </label>
</body>
</html>
