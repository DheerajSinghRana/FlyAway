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
<h2>Set New password</h2>
<form action="adminPasswordResetNow" method=post>
<table class="center">
<tr><td>Enter New Password</td><td><input type="hidden" name="email" value="<% out.write((String)request.getParameter("id")); %>"/><input type="text" name="password" placeholder="Enter New Password" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="Submit"/></td></tr>
</table>
</form>
</body>
</html>