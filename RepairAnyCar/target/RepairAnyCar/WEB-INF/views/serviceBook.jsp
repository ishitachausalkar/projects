<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
In service book

<form:form modelAttribute="customer">
<form:input path="firstName" value = " ${sessionScope.customer.firstName}" /> ${sessionScope.customer.firstName}
 </form:form>
</body>
</html>