<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<div align="center">
<h1>Customer Login</h1>
</div>

<table>
<form:form modelAttribute="customer" >
<tr>
<td> Email address </td>
<td> <form:input path="emailAddress"/></td>
<td> <form:errors path="emailAddress"></form:errors></td>
</tr>

<tr>
<td> Password </td>
<td> <form:input path="password"/> </td>
<td> <form:errors path="password"></form:errors></td>
</tr>

<tr>
<td><br></td>
<td> <input type="submit" value="Login"/> </td>
</tr>

<tr>
<td> <a href="register"> Not a Customer? Register!!</a></td>
</tr>

</form:form>
</table>
</body>
</html>