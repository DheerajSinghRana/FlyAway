<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" /> 
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
<h1>FlyAway</h1>
<h2>Enter Username or email to reset your password</h2>
<form action="passwordReset" method=post>
<table class="center">
<tr><td>Enter Username/Email</td><td><input type="text" name="email" placeholder="Enter Username" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="Submit"/></td></tr>
</table>
</form>
</body>
</html>