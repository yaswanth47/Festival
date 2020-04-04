<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About FERS</title>
<style>
.content{

height:200px;
}
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}
.menu{
height: 40px;
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
<div class="menu" align="right"><a href='${pageContext.request.contextPath}/visitor/login.html'>Logout</a>&nbsp;&nbsp;&nbsp;<a href='${pageContext.request.contextPath}/visitor/eventregis.html'>EventCatalog</a>&nbsp;&nbsp;</div>
<h1 style="color: maroon;">ABOUT FERS</h1>
<hr>
<div class="content">
<p style="color: maroon;">FERS,or the Festival Event Registration System,is a provided as a free service of New CodingTon
Chamber of Commerce to the citizens and the visitors of the city of New CodingTon.FERS allows ease of use to view and registration to various events and activities in CodingTon area. 
</p>
<p style="color: maroon;">FERS was created in a joint with BLT,Ltd and the New CodingTon of Chamber and Commerce.Please submit any questions,comments or concerns about the usage,registration,event availability or any other information presented on this website to the New CodingTon Chamber of Commerce at question @newcodcc.gov.</p>
</div>
<div class="data">
<p style="color: blue;">please note that any events or activities that are scheduled via the Festival Event Registration System are subject to postponed and cancellation at any time.Please frequently check the site for latest events and availability.<pre></pre><center style="color: blue;">While using this site,you agree to have read and accepted our terms of use and privacy policy</center></p>
</div>
</body>
<footer>
<center style="color: blue;">@CopyRights,2020 by the New Codington Chamber of Commerce.All Rights Reserved.</center>
</footer>
</html>