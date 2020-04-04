<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password</title>

<style type="text/css">
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}
.error
{
color: red;
font-style: italic;
}
body{

margin:0px;
padding:0px;
}
</style>
</head>
<body>
<div id="header">&nbsp;
			<div align="center"><h3 style="color: maroon;">Festival Registration System</h3></div>
			</div>
<center>
<h2 style="color: maroon;">Change Password Screen</h2>
<table>
<tr><td align="center" colspan="2" style="font-style: italic;">Fields marked (<span style="font-weight: bold;color: red; font-size: 15px;">*</span>) are Mandatory</td></tr>
<form:form action="afterchange.html" method="post" modelAttribute="newpassword">
 <form:hidden path="id"/> 
<tr><td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>New Password:</td>
<td><form:input path="password" type="password"/></td>
<td><form:errors path="password" cssClass="error"/></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Confirm New Password:</td>
<td><form:input path="cmpassword" type="password"/></td>
<td><form:errors path="cmpassword" cssClass="error"/></td>
</tr>
<tr><td><input type="reset" value="cancel"/> &nbsp; <input type="submit" value="update"></td></tr>
</form:form>
</table>

</center>

</body>
</html>