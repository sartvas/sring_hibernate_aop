<%-- 
    Document   : emloyeeinfo
    Created on : 2 сент. 2021 г., 14:39:04
    Author     : sartv
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        



    <form:form action="saveemployee" modelAttribute="employee">
        <form:hidden path="id"/>
        Name<form:input path="name"/>
        <br><br>
        Surname<form:input path="surname"/>
        <br><br>
                Department
        <form:select path="department">
        <form:option value="IT" lable="IT"/>
        <form:option value="HR" lable="HR"/>      
        <form:option value="Sales" lable="HR"/> 
        </form:select>
        Salary<form:input path="salary"/>
        <br><br>

        <br><br>
        <input type="submit" value="ok">
        
    </form:form>
        
    </body>
</html>
