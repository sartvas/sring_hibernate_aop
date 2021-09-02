<%-- 
    Document   : allbook
    Created on : 2 сент. 2021 г., 15:34:58
    Author     : sartv
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All book</title>
    </head>
    <body>
        <h1>All book</h1>
        <table>
    <tr>
        <th>Name</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Primary cost</th>
        
    </tr>
     <c:forEach var="book" items="${allBooks}">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.genre}</td>
            <td>${book.primaryCost}</td>
        </tr>
 
    </c:forEach>
       </table>
    </body>
</html>
