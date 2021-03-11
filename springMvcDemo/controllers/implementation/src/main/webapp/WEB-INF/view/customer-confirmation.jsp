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
    <title>Customer Confirmation</title>
</head>
<body>
    <label>
        <a>The customer is confirmed: ${customer.firstName} ${customer.lastName}</a>
    </label>
    <br>
    <label>
        <a>Free passes: ${customer.freePasses}</a>
    </label>
    <br>
    <label>
        <a>Postal Code: ${customer.postalCode}</a>
    </label>
    <br><br>
    <label>
        <a href="${pageContext.servletContext.contextPath}/">Back to Menu</a>
    </label>
</body>
</html>
