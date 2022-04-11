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
<h2>Flight Booking</h2>
<h2>Welcome <% out.write((String)session.getAttribute("name"));%></h2>
<jsp:include page="menu.jsp" /> 
<%
  FlightData flightData= (FlightData)request.getAttribute("flightData"); 
int persons = Integer.parseInt((String)request.getAttribute("noOfPersons"));
double finalPrice = persons * flightData.getPrice();
String fPrice = ""+finalPrice;

%>
<h2>Please Review and Pay</h2>

<table class="center" border="1px">
 <tr>
    <th>Flight Name</th>
    <th>Departure Time</th>
    <th>From</th>
    <th>Number of Person Travelling</th>
    <th>To</th>
    <th>Total Price in INR</th>
   </tr>
  <tr>
    <td><%=flightData.getFlightName()%></td>
    <td><%=flightData.getTime()%></td>
    <td><%=flightData.getSourceCity()%></td>
    <td><%=(String)request.getAttribute("noOfPersons")%></td>
    <td><%=flightData.getDestinationCity()%></td>
    <td><%=fPrice%></td>
   </tr>
</table>   
<form action="payAndReceipt.jsp" method="post">
<input type="hidden" name="flightName" value="<%=flightData.getFlightName()%>"/>
<input type="hidden" name="time" value="<%=flightData.getTime()%>"/>
<input type="hidden" name="from" value="<%=flightData.getSourceCity()%>"/>
<input type="hidden" name="noOfPersons" value="<%=(String)request.getAttribute("noOfPersons")%>"/>
<input type="hidden" name="to" value="<%=flightData.getDestinationCity()%>"/>
<input type="hidden" name="total" value="<%=fPrice%>"/>
<input type="submit" value="PAY NOW and BOOK"/>
</form>


<% } else { %>
<h1>Session Timeout</h1>
<% } %>
</body>
</html>