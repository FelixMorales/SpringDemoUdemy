<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: felix
  Date: 2/19/2021
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Student Confirmation</title>
</head>
<body>
    <label>
        <a>The student is confirmed: ${student.firstName} ${student.lastName}</a>
    </label>
    <br>
    <label>
        <a>Country: ${student.country.toUpperCase()}</a>
    </label>
    <br>
    <label>
        <a>Favorite Language: ${student.favoriteLanguage.toUpperCase()}</a>
    </label>
    <br>
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
    <br><br>
    <label>
        <a href="${pageContext.servletContext.contextPath}/">Back to Menu</a>
    </label>
</body>
</html>
