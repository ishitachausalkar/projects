<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<i>Successfully Added ${serviceCenter.serviceCenterName}</i>
		</h2>
	</div>
	
	<div>

<a href="${pageContext.request.contextPath}/customer/login"> Go Home</a>

</div>
</body>
</html>