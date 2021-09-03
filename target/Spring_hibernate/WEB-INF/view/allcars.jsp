<%-- 
    Document   : allcars
    Created on : 2 сент. 2021 г., 21:42:53
    Author     : sartv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Garage of our firm</title>
    </head>
    <body>
        <h1>All our cars</h1>
        <table>
             <tr>
                <th>Lable</th>
                <th>Model</th>
                <th>Bodywork</th>
                <th>Cost</th>
            </tr>
            <tr>
     <c:forEach var="ourcar" items="${allCar}">
        <tr>
            <td>${ourcar.lable}</td>
            <td>${ourcar.model}</td>
            <td>${ourcar.bodywork}</td>
            <td>${ourcar.cost}</td>
        </tr>
 
    </c:forEach>
            </tr>
        </table>
    </body>
</html>
