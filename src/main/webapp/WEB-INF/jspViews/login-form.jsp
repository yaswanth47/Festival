<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>


#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}
body{

margin:0px;
padding:0px;
}

a{
text-decoration: none;
}
a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
<div id="header">&nbsp;
			<div align="center"><h3 style="color: maroon;">Festival Registration System</h3></div>
			</div>
<center>
<form:form action="eventregis.html" modelAttribute="customer" method="post">
<form:hidden path="id"/>
<table>

<tr><td style="color: maroon;">VisitorName:</td><td><form:input path="username" type="text"/></td></tr>
<tr><td style="color: maroon;">Password:</td><td><form:input path="password" type="password"/></td></tr>

<tr><td></td><td><input type="submit" value="Login"></td></tr>

<tr><td>New Visitor:</td></tr>
<tr><td style="color: maroon;"><a href="${pageContext.request.contextPath}/visitor/savecustomer.html">Register here</a></td>
</tr>
<tr><td style="color: maroon;"><a href="${pageContext.request.contextPath}/visitor/loadevent.html">Event register</a></td>
</table>


</form:form>

</center>

</body>
</html>