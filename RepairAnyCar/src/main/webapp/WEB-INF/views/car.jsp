<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Add Your Cars</h1>
</div>

<table>
<form:form modelAttribute="vehicle">

<tr>
<td> Car Company</td>
<td> <form:input path="company"/></td>
<td> <form:errors path="company"></form:errors></td>
</tr>

<tr>
<td> Car Number Plate </td>
<td> <form:input path="numberPlate"/> </td>
<td> <form:errors path="numberPlate"></form:errors></td>
</tr>

<tr>
<td> Car Model </td>
<td> <form:input path="model"/> </td>
<td> <form:errors path="model"></form:errors></td>
</tr>



<tr>
<td><br></td>
<td> <input type="submit" value="CarRegister"/> </td>
</tr>

</form:form>
</table>
</body>
</html>