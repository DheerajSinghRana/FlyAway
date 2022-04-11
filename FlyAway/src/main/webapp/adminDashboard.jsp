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
#myLIV {
  
  text-align:right;
  
}
</style>
<meta charset="ISO-8859-1">
<title>Admin Master Data</title>
</head>
<body>
<% if(session.getAttribute("name") != null) { %>
<h1>FlyAway</h1>
<h2>Welcome <% out.write((String)session.getAttribute("name"));%></h2>
<div id="myLIV">
<a href="logout.jsp" >LOGOUT </a><br/>
</div>
<h2 style="color: red;"><% if(request.getParameter("success") != null && "true".equals(request.getParameter("success"))){out.write("Data Successfully Saved!!!");} %></h2>
<h2>Enter Master Data</h2>
<form action="flightDataRegistration" method=post>
<table class="center">
<tr><td>Enter Source City</td><td><input type="text" name="source" placeholder="Enter Source" required="required"/></td></tr>
<tr><td>Enter Destination City</td><td><input type="text" name="destination" placeholder="Enter Destination" required="required"/></td></tr>
<tr><td>Enter Flight Name</td><td><input type="text" name="fightName" placeholder="Flight Name" required="required"/></td></tr>
<tr><td>Enter date</td><td><input type="text" name="date" placeholder="dd/MM/yyyy" required="required"/></td></tr>
<tr><td>Enter Price</td><td><input type="text" name="price" placeholder="Price" required="required"/></td></tr>
<tr><td>Enter Time</td><td><input type="text" name="time" placeholder="Time" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="submit"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="reset" value="reset"/></td></tr>
</table>
</form>

<% } else { %>
<h1>Session Timeout!!!!</h1>
<% } %>
</body>
</html>