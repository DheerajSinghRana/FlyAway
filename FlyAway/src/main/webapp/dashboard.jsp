<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session = "true" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" /> 
<meta charset="ISO-8859-1">
<title>FlyAway Dashboard</title>
</head>
<body>
<% if(session.getAttribute("name") != null) { %>
<h1>FlyAway Dashboard</h1>
  <h2>Welcome <% out.write((String)session.getAttribute("name"));%></h2>
<jsp:include page="menu.jsp" /> 

<h2>Search Flight</h2>
<form action="searchFlight" method=post>
<table class="center">
<tr><td>Source City</td><td><input type="text" name="source" placeholder="Enter Source" required="required"/></td></tr>
<tr><td>Destination City</td><td><input type="text" name="destination" placeholder="Enter Destination" required="required"/></td></tr>
<tr><td>Enter date</td><td><input type="text" name="flightDate" placeholder="dd/MM/yyyy" required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;</td><td><input type="submit" value="Search Flight"/></td></tr>
</table>
</form> 
<% } else { %>
<h1>Session Timeout</h1>
<% } %>
</body>
</html>