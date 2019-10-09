<%-- 
    Document   : results
    Created on : Mar 9, 2019, 5:32:41 PM
    Author     : ishit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <body>
        <table border="1">
            <thead>
            <th>title</th>
            <th>actor</th>
            <th>actress</th>
            <th>genre</th>
            <th>year</th>
        </thead>
        <tbody>            

            <tr>
                <td>${movieSearch.title}</td>
                <td>${movieSearch.actor}</td>
                <td>${movieSearch.actress}</td>
                <td>${movieSearch.genre}</td>
                <td>${movieSearch.year}</td>
            </tr>    


        </tbody>
    </table>
    <br>
    <br>
    <br>
    <br>
    <a href="/Hw5Part7/redirect.htm">Click here to go back to main page</a>   
    </body>
</html>
