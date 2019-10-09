<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2><i> Choose One of the Our Following Partners</i></h2>
</div>

<table>
<tr>
<td> 	<div align="center">
	<c:forEach  var="serviceCenters" items="${sessionScope.list}"> 
	<a href="${pageContext.request.contextPath}/serviceCenter/dashboard?serviceCenterId=${serviceCenters.serviceCenterId}">${serviceCenters.serviceCenterName}</a>  <br>
	
	
	</c:forEach>
	
	</div>
	</td>
	</tr>
</table>
</body>
</html>