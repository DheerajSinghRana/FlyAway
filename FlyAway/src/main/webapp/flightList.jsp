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
<h2>Available flights</h2>
<h2>Welcome <% out.write((String)session.getAttribute("name"));%></h2>
<jsp:include page="menu.jsp" /> 
<%
  ArrayList<FlightData> fData=(ArrayList<FlightData>) request.getAttribute("flightDatas"); 
  for (FlightData flightData: fData) {   
%>

<table class="center" border="1px">
  <tr>
    <td><%=flightData.getFlightName()%></td>
    <td><%=flightData.getTime()%></td>
    <td><%=flightData.getPrice()%></td>
    <td><a href="bookFlight.jsp?idf=<%=flightData.getFlightId()%>"><input type="submit" value="Book Flight"/></a></td>
   </tr>
</table>   
<%}%>
</form>
<% } else { response.sendRedirect("userLogin.jsp");%>
<h1>Session Timeout</h1>
<% } %>
</body>
</html>