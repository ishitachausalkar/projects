<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>
			<i>All the Request you have are below</i>
		</h2>
	</div>
	
	<table>
<tr>
<td> 	<div align="center">
	<c:forEach  var="requests" items="${bookings}"> 
	<div>
	Customer First Name :${requests.customer.firstName}
	</div><br>
	
		<div>
	Customer Last Name: ${requests.customer.lastName}
	</div><br>
	
		<div>
	Customer Email Address: ${requests.customer.emailAddress}
	</div><br>
	
	<div>
	Appointment Time: ${requests.appointmentTime}
	</div><br>
	
	<div>
	Vehicle Number: ${requests.vechileNumber}
	</div><br>
	
	<%-- <c:forEach  var="vehicles" items="${vehiclesToService}"> 
	   ${vehicles.company }<br>
	   ${vehicles.model }<br>
	   ${vehicles.numberPlate }<br>
	</c:forEach> --%>
	
     <br>
     <a href="${pageContext.request.contextPath}/partner/completed?bookingId=${requests.bookingId}">Completed</a>
	</c:forEach>
	
	</div>
	</td>
	</tr>
</table>
</body>
</html>