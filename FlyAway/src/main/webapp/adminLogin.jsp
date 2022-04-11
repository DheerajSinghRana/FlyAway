<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: orange;
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
<title>Admin Login</title>
</head>
<body>
<h2>Admin Login</h2>
<form action="adminLogin"  method=post>
<input type="text" name="username" placeholder="Enter Username"/><br/>
<input type="password" name="password" placeholder="Enter Password"/><br/>
<input type="submit" value="submit"/><br/>

</form>
<a href="adminforgotpassword.jsp">Forgot  password</a>
</body>
</html>