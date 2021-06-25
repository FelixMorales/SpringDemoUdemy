<%--
  Created by IntelliJ IDEA.
  User: felix
  Date: 6/24/2021
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Customer Form</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <form:form action="saveCustomer" modelAttribute="customer" method="post">
                <table>
                    <tbody>
                        <tr>
                            <td><label>First Name:</label></td>
                            <td><form:input path="firstName"/></td>
                        </tr>
                        <tr>
                            <td><label>Last Name:</label></td>
                            <td><form:input path="lastName"/></td>
                        </tr>
                        <tr>
                            <td><label>Email:</label></td>
                            <td><form:input path="email"/></td>
                        </tr>
                        <tr>
                            <td><label></label></td>
                            <td><input type="submit" value="Save"></td>
                        </tr>
                    </tbody>
                    <p>
                        <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
                    </p>
                </table>
            </form:form>
        </div>
    </div>
</body>
</html>
