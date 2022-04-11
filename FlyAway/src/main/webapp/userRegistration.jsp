<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: linen;
  text-align: center;
}

h1 {
  color: maroon;
  text-align: center;
}
.center {
  margin-left: auto;
  margin-right: auto;
  
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FlyAway</h1>
<h2>User Registration</h2>
<form action="registerUser" method=post>
<table class="center">
<tr><td>Full Name</td><td><input type="text" name="name" placeholder="Full Name" required="required"/></td></tr>
<tr><td>Phone</td><td><input type="text" name="phone" placeholder="Mobile" required="required"/></td></tr>
<tr><td>Email</td><td><input type="text" name="email" placeholder="Email" required="required"/></td></tr>
<tr><td>Password</td><td><input type="password" name="password" placeholder="Password" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="submit"/></td></tr>
</table>
</form>

</body>
</html>