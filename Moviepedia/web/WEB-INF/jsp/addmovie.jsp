<%-- 
    Document   : addmovie
    Created on : Mar 9, 2019, 5:24:03 PM
    Author     : Ishit
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
        <h1> Please enter the below details </h1>
        <hr>
        <form:form commandName="addMovie" method="POST">
        <form:errors path="*" element="div" />
         Movie:<form:input path="title" /><br>
        <br>
        Actor: <form:input path="actor" /><br>
        <br>
        Actress:<form:input path="actress" /><br>
        <br>
        Genre:  <form:input path="genre" /> <br>
        <br>
        Year:   <form:input path="year" /><br>
        <br>
        <input type="submit" value="ADD TO MOVIE">                       
        </form:form>
    </body>
</html>
