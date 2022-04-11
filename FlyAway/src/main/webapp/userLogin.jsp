<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" /> 
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h1>FlyAway</h1>
<h2>User Login</h2>
<form action="loginUser" method=post>
<table class="center">
<tr><td>Username</td><td><input type="text" name="username" placeholder="Enter Username" required="required"/></td></tr>
<tr><td>Password</td><td><input type="password" name="password" placeholder="Enter Password" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="Login"/></td></tr>
</table>
</form>

<a href="forgotPassword.jsp">Forgot  password</a>

</body>
</html>