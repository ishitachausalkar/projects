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
<h1> Welcome  Admin</h1>
	<div align="right">
		<a href="customer/logout"><b> Logout</b></a>
	</div>
	
	<div align="center">
		<a href="${pageContext.request.contextPath}/admin/register"><b> Add Service center</b></a>
	</div>
</body>
</html>