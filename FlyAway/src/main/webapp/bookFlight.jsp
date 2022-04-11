<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,com.dheeraj.flyaway.model.FlightData" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" /> 
<meta charset="ISO-8859-1">
<title>Flight List</title>
</head>
<body>
<% if(session.getAttribute("name") != null) { %>
<h1>FlyAway</h1>
<h2>Booking flight</h2>
<h2>Welcome <% out.write((String)session.getAttribute("name"));%></h2>
<jsp:include page="menu.jsp" /> 
<h3>Please do not refresh or go back</h3>

<form action="flightBookingInfo" method=post>
<table class="center">
<tr><td>Enter Number of Person Travelling</td><td><input type="text" name="personNo" placeholder="Number of Person " required="required"/></td></tr>
<tr><td>&nbsp;&nbsp;<input type="hidden" name="fId" value="<% out.write((String)request.getParameter("idf"));%>"/></td><td><input type="submit" value="Continue"/></td></tr>
</table>
</form>

<% } else { %>
<h1>Session Timeout</h1>
<% } %>
</body>
</html>