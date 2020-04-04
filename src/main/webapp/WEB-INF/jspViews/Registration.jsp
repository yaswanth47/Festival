<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Festival Registration System</title>

<script>


function isNumeric(value) {
	  if (value=="" || value == null || !value.toString().match(/^[-]?\d*\.?\d*$/))
	  { return false;
	  }
	  return true;
	}		
	function echeck(str) {
		   var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;   
			   return emailPattern.test(str);   							
	}
	function validateForm()
	{
		var x=false;
	var fname=document.getElementById('firstname').value;
	var lname=document.getElementById('lastname').value;
	var uname=document.getElementById('username').value;
	var pwd=document.getElementById('password').value;
	var cpwd=document.getElementById('cpassword').value;
	var email=document.getElementById('email').value;
	var phoneno=document.getElementById('phoneno').value;
	if (fname==null || fname=="")
	  {
	  alert("Please provide Firstname");
	  return x;
	  }
	if (lname==null || lname=="")
	  {
	  alert("Please provide Lastname");
	  return x;
	  }
	if (uname==null || uname=="")
	  {
	  alert("Please provide Username");
	  return x;
	  }
	if (pwd==null || pwd=="")
	  {
	  alert("Please provide password");
	  return x;
	  }
	if (cpwd==null || cpwd=="")
	  {
	  alert("Please confirm password");
	  return x;	
	  }
	if (email==null || email=="")
	  {
	  alert("Please provide Email");
	  return x;
	  }
	if (phoneno==null || phoneno=="")
	  {
	  alert("Please provide Phonenumber");
	  return x;
	  }
	if(pwd!=cpwd)
	{
		alert("Password and confirm paswword must be same !!");
		return x;
	}
	if (echeck(email)==false){
		alert("Invalid EmailID");
		return x;
	}
	if(isNumeric(phoneno)==false)
	{
		alert("Invalid Phonenumber");
		return x;
	}
}
	function cancelRegistration()
	{
		history.go(-1);
	}

</script>

<style>


tr,td{

padding:5px;
}
#header{
background-color:rgb(36, 143, 139);
font-size: 32px;
}
body{

margin:0px;
padding:0px;
}

.outline{

}
tr,td,th{
color:maroon;

}


a{
text-decoration: none;

}
a:hover {
	text-decoration: underline;
}
.error
{
color:red;
font-style: italic;
}
</style>
</head>
<body>
<div id="header">&nbsp;
			<div align="center"><h3 style="color: maroon;">Festival Registration System</h3></div>
			</div>
			<br>
			<div align="right"><a href='login.html'>Login_Page</a></div><br>
<div class="outline">
<center>
<h3 style="color: maroon;">New Visitor Registration Page</h3>

<form:form action="successRegi.html" method="post"  modelAttribute="newvisitor">
<form:hidden path="id"/>
<br>
<table width="90" align="center">
<tr><td align="center" colspan="2" style="font-style: italic;">Fields marked (<span style="font-weight: bold;color: red; font-size: 15px;">*</span>) are Mandatory</td></tr>
						
<tr><td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>FirstName:</td>
<td><form:input path="firstname" type="text" id="firstname" /></td>
<td><form:errors path="firstname" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>LastName:</td>
<td><form:input path="lastname" type="text" id="lastname"/></td>
<td><form:errors path="lastname" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>UserName:</td>
<td><form:input path="username" type="text" id="username"/></td>
<td><form:errors path="username" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Password:</td>
<td><form:input path="password" type="password" id="password"/></td>
<td><form:errors path="password" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Confirm Password:</td>
<td><form:input path="cmpassword" type="password" id="cpassword"/></td>
<td><form:errors path="cmpassword" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Email:</td>
<td><form:input path="email" type="email" id="email"/></td>
<td><form:errors path="email" cssClass="error" /></td>
</tr>
<tr>
<td><span style="font-weight: bold;color: red;font-size: 15px;">*</span>Phone number:</td>
<td><form:input path="phonenumber" type="text" id="phoneno"/></td>
<td><form:errors path="phonenumber" cssClass="error" /></td>
</tr>
<tr><td>Address:</td>
<td><form:textarea path="address"/></td>

</tr>
<tr><td></td><td><input type="submit" value="register" onsubmit="return validateForm()"/> &nbsp; <input type="reset" value="clear"></td></tr>
</table>


</form:form>

</center>
</div>
</body>
</html>