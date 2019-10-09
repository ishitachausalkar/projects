<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>
			<i>Add a Partner</i>
		</h2>
	</div><form:form modelAttribute="serviceCenter">

		<tr>
			<td>Service Center Name</td>
			<td><form:input path="serviceCenterName"/></td>
			<td><form:errors path="serviceCenterName"></form:errors></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>Email Id</td>
			<td><form:input path="emailId"/></td>
			<td><form:errors path="emailId"></form:errors></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>Password</td>
			<td><form:input path="password"/></td>
			<td><form:errors path="password"></form:errors></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>House Number</td>
			<td><form:input path="address.houseNumber"/></td>
			<td><form:errors path="address.houseNumber"></form:errors></td>
		</tr>
		<br>
		<br>
		<tr>
			<td>Street</td>
			<td><form:input path="address.street"/></td>
			<td><form:errors path="address.street"></form:errors></td>
		</tr>
		<br>
		<br>		
		<tr>
			<td>City</td>
			<td><form:input path="address.city"/></td>
			<td><form:errors path="address.city"></form:errors></td>
		</tr>
		<br>
		<br>		
		<tr>
			<td>Country</td>
			<td><form:input path="address.country"/></td>
			<td><form:errors path="address.country"></form:errors></td>
		</tr>
		<br>
		<br>	
		<tr>
			<td>Zip Code</td>
			<td><form:input path="address.zipCode"/></td>
			<td><form:errors path="address.zipCode"></form:errors></td>
		</tr>
		<br>
		<br>

		<br>

		<br>
		<tr>
			<td></td>
		</tr>

		<tr>
			<td><br></td>
			<td><input type="submit" value="Register" /></td>
		</tr>

	</form:form>
	
	
</body>
</html>