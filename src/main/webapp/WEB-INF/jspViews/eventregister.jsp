<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Registration Page</title>
<style>
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
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
	<form:form action="registeredevent.html" method="post"
		modelAttribute="event">
		<form:hidden path="id"/>

		<table align="center">
			<tr>
				<td>Eventname</td>
				<td><form:input path="eventname" type="text" id="eventname"/></td>
			</tr>
			<tr>
				<td>description</td>
				<td><form:input path="description" type="text" id="description"/></td>
			</tr>
			<tr>
				<td>place</td>
				<td><form:input path="places" type="text" id="places"/></td>
			</tr>
			<tr>
				<td>duration</td>
				<td><form:input path="duration" type="text" id="duration"/></td>
			</tr>
			<tr>
				<td>EventType</td>
				<td><form:input path="eventtype" type="text" id="eventtype" /></td>
			</tr>
			<tr>
				<td>Maxseats</td>
				<td><form:input path="maxseats" type="text" id="maxseats" /></td>
			</tr>
			<tr>
				<td>availableseats</td>
				<td><form:input path="availableseats" type="text" id="availableseats" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>