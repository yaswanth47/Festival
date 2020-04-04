<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Festival Main Page</title>
<style>
.content {
	width: 900px;
	height: 400px;
	border: 2px black;
}

.content2{
	float: left;
	margin-top: 20px;
	width: 900px;
	height: 300px;
	
}
table#data th{
background-color:rgb(34, 181, 125);
}

tr, th, table, td {

	padding: 10px;
}
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}

.menu{
height: 40px;
}

a{
text-decoration: none;
}
a:hover {
	text-decoration: underline;
}
tr,td,th{
color:maroon;
border-collapse: collapse;
}

.event{


}body{

margin:0px;
padding:0px;
}

</style>
</head>
<body>
<div id="header">&nbsp;
			<div align="center"><h3 style="color: maroon;">Festival Registration System</h3></div>
			</div>
<div class="menu" align="right">

<c:set var="id" value="${id}">
					
				</c:set>
<a href="${pageContext.request.contextPath}/visitor/login.html">Logout</a>&nbsp;&nbsp;

<a href='updatepassword.html?id=${id}'>ChangePassword</a>&nbsp;&nbsp;
<a href='eventregister.html'>EventCatalog</a>&nbsp;&nbsp;
<a href='about.html'>About</a>&nbsp;&nbsp;
</div>

	<%
		String name = request.getParameter("username");
	%>
	<div align="center">
	<h1 style="color: maroon;">
		Festival Portal Page:Welcome
		<%=name%>
		to your portal page.....
	</h1>
	</div>
	<br>
	<br>
	<center>
		<div class="content" align="center">
			<table>
				<%-- <tr>
					<td colspan="5">Your Personal information is below.To change your information:<a href="${pageContext.request.contextPath}/visitor/upadate.html">click here</a></td>
				</tr> --%>
				
						<c:url var="updateLink" value="/visitor/savedata.html?id=${id}">
				
				</c:url><c:forEach var="customersdata" items="${details}">
					<tr>
						<tr><td>${customersdata}</td></tr>
						<%-- <td>${customersdata.email}</td>
						<td>${customersdata.firstname}</td>
						<td>${customersdata.lastname}</td>
						<td>${customersdata.address}</td> --%>
					
					</tr>
				</c:forEach>
					<tr><td><a href="${updateLink}">Click Here</a></td></tr>
			</table> 
		</div>
<hr>
<div class="event"></div>

<hr>
		<div class="content2" align="center">
			<table id="data">

				<tr>
					<th>EventId</th>
					<th>EventName</th>
					<th>description</th>
					<th>Places</th>
					<th>Duration</th>
					<th>Event Type</th>
					<th>Available Tickets</th>
				</tr>
               <tr>
               <c:forEach var="eventitems" items="${eventlist}">
               <td>${eventitems.id}</td>
               <td>${eventitems.eventname}</td>
               <td>${eventitems.description}</td>
               <td>${eventitems.places}</td>
               <td>${eventitems.duration}</td>
               <td>${eventitems.eventtype}</td>
               <td>${eventitems.availableseats}</td>
               
               
               </tr>
             	</c:forEach>


			</table>


		</div>
	</center>
</body>
</html>