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
			<i>Your Booking is for
				${sessionScope.serviceCenter.serviceCenterName}</i>
		</h2>
	</div>

	<form:form modelAttribute="booking">

		<tr>
			<td>First Name</td>
			<td><form:input path="customer.firstName"
					value=" ${sessionScope.customer.firstName}" /></td>
			<td><form:errors path="customer.firstName"></form:errors></td>
		</tr>

		<tr>
			<td>Last Name</td>
			<td><form:input path="customer.lastName"
					value=" ${sessionScope.customer.lastName}" /></td>
			<td><form:errors path="customer.firstName"></form:errors></td>
		</tr>

		<tr>
			<td>Email Address</td>
			<td><form:input path="customer.emailAddress"
					value=" ${sessionScope.customer.emailAddress}" /></td>
			<td><form:errors path="customer.firstName"></form:errors></td>
		</tr>
		<tr>
			<td></td>
		</tr>
		<tr>
			<c:forEach var="vehicles" items="${sessionScope.customer.vehicles}">
				<form:radiobutton path="vechileNumber"
					value="${vehicles.numberPlate}" /> ${vehicles.model} (${vehicles.numberPlate})  <br>
			</c:forEach>
		</tr>

		<tr>
			<td>Select appointment time <form:select path="appointmentTime">
					<form:option value="8am">8.00 am</form:option>
					<form:option value="8.30am">8.30 am</form:option>
					<form:option value="9am">9.00 am</form:option>
					<form:option value="9.30am">9.30 am</form:option>
					<form:option value="10am">10.00 am</form:option>
					<form:option value="10.30am">10.30 am</form:option>
					<form:option value="11am">11.00 am</form:option>
					<form:option value="11.30am">11.30 am</form:option>
					<form:option value="12pm">12.00 pm</form:option>
					<form:option value="12.30pm">12.30 pm</form:option>
					<form:option value="1pm">1.00 pm</form:option>
					<form:option value="1.30am">1.30 pm</form:option>
					<form:option value="2pm">2.00 pm</form:option>
					<form:option value="2.30pm">2.30 pm</form:option>
					<form:option value="3pm">3.00 pm</form:option>
					<form:option value="3.30pm">3.30 pm</form:option>
					<form:option value="4pm">4.00 pm</form:option>
					<form:option value="4.30pm">4.30 pm</form:option>
					<form:option value="5pm">5.00 pm</form:option>
				</form:select>

			</td>
		</tr>
		<tr>
			<td><br></td>
			<td><input type="submit" value="Book" /></td>
		</tr>

	</form:form>
</body>
</html>