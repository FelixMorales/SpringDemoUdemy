<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: felix
  Date: 3/10/2021
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">
        <a>First Name:</a>
        <form:input path="firstName"/>
        <br>
        <a>Last Name (*):</a>
        <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br>
        <a>Free Passes (*):</a>
        <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br>
        <a>Postal Code (*):</a>
        <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
