<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="updatedata.html" modelAttribute="update" method="post">
<table>
<tr>
<td>UserName</td>
<td><form:input type="text" path="firstname"/></td>
</tr>

<tr>
<td>ID</td>
<td><form:input type="text" path="id"/></td>
</tr>

<tr>
<td>Email</td>
<td><form:input type="text" path="email"/></td>
</tr>

<tr>
<td>PhoneNumber</td>
<td><form:input type="text" path="phonenumber"/></td>
</tr>

<tr>
<td>Address</td>
<td><form:input type="text" path="address"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="update">&nbsp;<input type="reset" value="clear"></td> 
</tr>
</table>


</form:form>
</body>
</html>