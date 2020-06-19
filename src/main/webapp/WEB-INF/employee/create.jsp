<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 6/19/2020
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<h3>Welcome, Enter the Employee Details</h3>
<form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">Employee</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        
        <tr>
            <td><form:label path="name">Employee's name :</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        
        <tr>
            <td><form:label path="contactNumber">Contact's Number</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td colspan="2"align="center">
                <form:button>Submit</form:button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
