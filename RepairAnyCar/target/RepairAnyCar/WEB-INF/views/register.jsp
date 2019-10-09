<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>

<body>

	<div align="center">
		<h1>Customer Registration</h1>
	</div>
	<table>
		<form:form modelAttribute="customer">
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName"></form:errors></td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName"></form:errors></td>
			</tr>
			
			<tr>
				<td>Email address</td>
				<td><form:input path="emailAddress" /></td>
				<td><form:errors path="emailAddress"></form:errors></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password"></form:errors></td>
			</tr>
			
<%-- 			<tr>
				<td>Vehicle</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password"></form:errors></td>
			</tr> --%>
			
<tr>
<td> <a href="login"> Already a Customer? Login!!</a></td>
</tr>
			<tr>
				<td><br></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>