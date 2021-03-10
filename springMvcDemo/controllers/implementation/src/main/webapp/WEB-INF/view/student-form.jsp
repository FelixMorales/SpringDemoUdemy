<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Hello World - Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        <label>
            <a>First Name:</a><form:input path="firstName"/>
        </label>
        <br>
        <label>
            <a>Last Name:</a><form:input path="lastName"/>
        </label>
        <br>
        <label>
            <a>Country:</a>
            <form:select path="country">
                <form:options items="${countriesList}"/>
            </form:select>
        </label>
        <br>
        <label>
            <a>Favorite Language:</a>
            <form:radiobuttons path="favoriteLanguage" items="${languageList}"/>
        </label>
        <br>
        <label>
            <a>Operating System:</a>
            <form:checkbox path="operatingSystems" value="windows" label="Windows"/>
            <form:checkbox path="operatingSystems" value="linux" label="Linux"/>
            <form:checkbox path="operatingSystems" value="ms-windows" label="MS Windows"/>
        </label>
        <br><br>
        <label>
            <input type="submit" value="Submit"/>
        </label>
    </form:form>
</body>
</html>
