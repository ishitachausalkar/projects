<%-- 
    Document   : searchmovie
    Created on : Mar 9, 2019, 5:25:35 PM
    Author     : ishit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form commandName="searchMovie" method="POST">
      <form:errors path="*" element="div" />    
       Search By MovieId:  <form:input path="id" /> <br>
      <br>
    
      <input type="submit" value="SEARCH MOVIES"/>
      </form:form>
    </body>
</html>
