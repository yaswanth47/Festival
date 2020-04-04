<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
	<%@taglib prefix="jstlcore" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Welcome to Festival Event Registration System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="StyleSheet" href="css/struts2.css" type="text/css" />

<script type="text/javascript">
function previousPage()
{
	history.go(-1);
}

function myf()
{document.getElementById("regis").disabled=true;}
</script>
<style type="text/css">
body{

margin:0px;
padding:0px;
}
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}

</style>
</head>
<body>

<br/><br/><br/>
	<table width="80%" align="center" border="2">
		<tr>
			<td>
			<div id="header">&nbsp;
			<div align="center">Festival
			Registration System</div>
			</div>

			<table>
				<tr>
					<td width="100%">
					<table align="right" cellpadding="2">
						<tr>
							<td width="90">
							<div id="menu" align="center"><a href="<jstlcore:url value="/index.jsp"/>">
							Logout </a></div>
							</td>
							<td width="160">
							<div id="menu" ><a href="<jstlcore:url value="/visitor/main.html"/>">
							My_Portal </a></div>
							</td>
							<td width="90">
							<div id="menu" align="center"><a href="<jstlcore:url value="/visitor/about.html"/>">
							About</a><br />
							</div>
							</td>
						</tr>
					</table>
					</td>
				</tr>
				<tr>
					<td width="900">
					<div align="center"><img src="images/greenhorizontalline.jpg"
						height="5" width="100%" /></div>
					<br />
					<div id="content" align="center">
					<h3>Up-coming Events</h3>
					<table width="96%" border="1" align="center">
						<tr bgcolor="#669966">
							<th scope="col">Event Id</th>
							<th scope="col">Event name</th>
							<th scope="col">Description</th>
							<th scope="col">Places</th>
							<th scope="col">Duration</th>
							<th scope="col">Event type</th>
							<th scope="col">Maximum Seats</th>
							<th scope="col">Available Seats</th></tr>
					
 <jstlcore:forEach items="${events}" var="event" >
							<tr>
							<td><jstlcore:out value="${event.id}"></jstlcore:out></td>
							<td><jstlcore:out value="${event.eventname}"></jstlcore:out></td>
							<td><jstlcore:out value="${event.description}"></jstlcore:out></td>
							<td><jstlcore:out value="${event.places}"></jstlcore:out></td>
							<td align="center"><jstlcore:out value="${event.duration}"></jstlcore:out></td>
							<td><jstlcore:out value="${event.eventtype}"></jstlcore:out></td>
							<td align="center"><jstlcore:out value="${event.maxseats}"></jstlcore:out></td>	
							<td align="center"><jstlcore:out value="${event.availableseats}"></jstlcore:out></td>
							<td><a href="<jstlcore:url value="/visitor/register.html?id=${event.id}"/>">register</a></td>
							
							<td><a href="<jstlcore:url value="/visitor/unregister.html?id=${event.id}"/>">unregister</a></td>
						</tr>
						</jstlcore:forEach>
	
					</table>

					</div>
					</td>
				</tr>
				<tr></tr>
				<tr><td><br/></td></tr>
				<tr><td><br/></td></tr>
				<tr><td><br/></td></tr>
			</table>
			</td>

		</tr>
		
	</table>

</body>

</html>