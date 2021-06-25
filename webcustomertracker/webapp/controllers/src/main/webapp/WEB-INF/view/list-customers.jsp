<%--
  Created by IntelliJ IDEA.
  User: felix
  Date: 6/24/2021
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Customer List</h2>
        </div>
    </div>
    <div id="container">
        <div id="content">
            <input type="button" value="Add Customer" onclick="window.location.href='showFormAdd'; return false;"/>
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="tempCustomer" items="${customers}">

                    <c:url var="updateLink" value="/customer/showUpdateForm">
                        <c:param name="customerId" value="${tempCustomer.id}"/>
                    </c:url>

                    <c:url var="deleteLink" value="/customer/delete">
                        <c:param name="customerId" value="${tempCustomer.id}"/>
                    </c:url>

                    <tr>
                        <td>${tempCustomer.firstName}</td>
                        <td>${tempCustomer.lastName}</td>
                        <td>${tempCustomer.email}</td>
                        <td>
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
