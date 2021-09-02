<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
 
<h2>All Employees</h2>
<br><br>
<table>
    <tr>
        <TH>Name</TH>
        <TH>Surname</TH>
        <TH>Department</TH>
        <TH>Salary</TH>
    </tr>
 
    <c:forEach var="emp" items="${allEmps}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
        </tr>
 
    </c:forEach>
</table>

<br>

<input type = "button" value = "Add"
       onclick = "window.location.href = 'addnewemployee'"/>
 
 
</body>
</html>