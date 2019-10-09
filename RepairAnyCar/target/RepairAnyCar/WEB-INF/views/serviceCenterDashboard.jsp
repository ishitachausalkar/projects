<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2><i>${serviceCenter.serviceCenterName}</i></h2>
</div>
<br>

<div align="right">
<h5> ${serviceCenter.address.houseNumber}</h5>
<h5> ${serviceCenter.address.street}</h5>
<h5> ${serviceCenter.address.city}</h5>
<h5> ${serviceCenter.address.country}</h5>
<h5> ${serviceCenter.address.zipCode}</h5>
</div>

<br>
<div align="justify">
<h4>
<c:forEach var="services" items="${serviceCenter.services}">
${services.serviceName}<br>
 </c:forEach>
${service}
</h4>
</div>

<br>
<div>

<a href="${pageContext.request.contextPath}/serviceCenter/serviceForm"> Book Appointment</a>

</div>
</body>
</html>