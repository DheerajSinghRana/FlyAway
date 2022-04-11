<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" />  
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Welcome to FlyAway</h1>
<p> Developer: Dheeraj Singh Rana</p>
<h2>Choose who you are..</h2>
<div id="myDIV">
<a href="userLogin.jsp" >User login </a><br/><a href="userRegistration.jsp" >Registration </a><br/></div>
<div id="myLIV">
<a href="adminLogin.jsp" >Admin login </a><br/><br/>
</div>



<h2>Search Flight</h2>
<form action="searchFlight" method=post>
<table class="center">
<tr><td>Source City</td><td><input type="text" name="source" placeholder="Enter Source" required="required"/></td></tr>
<tr><td>Destination City</td><td><input type="text" name="destination" placeholder="Enter Destination" required="required"/></td></tr>
<tr><td>Enter date</td><td><input type="text" name="flightDate" placeholder="dd/MM/yyyy" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="Search Flight"/></td></tr>
</table>
</form>

</body>
</html>