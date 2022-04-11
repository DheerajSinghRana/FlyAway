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
<jsp:include page="menu.jsp" /> 
<a href="javascript:payNow()"><img id="pay" alt="Pay Now" src="images/Paynow.gif"></a>

<div id="data" style="display:none">
<h1 style="color: green">Transaction Successfull!</h1>
<h2>Your Ticket</h2>
<table class="center" border="1px" >
 <tr>
    <th>Flight Name</th>
    <th>Departure Time</th>
    <th>From</th>
    <th>Number of Person Traveling</th>
    <th>To</th>
    <th>Total Price Paid in INR</th>
   </tr>
  <tr>
    <td><%=request.getParameter("flightName")%></td>
    <td><%=request.getParameter("time")%></td>
    <td><%=request.getParameter("from")%></td>
    <td><%=request.getParameter("noOfPersons")%></td>
    <td><%=request.getParameter("to")%></td>
    <td><%=request.getParameter("total")%></td>
   </tr>
</table>  
</div> 
<script type="text/javascript">
function payNow() {
    var img = document.getElementById('pay');
    img.style.visibility = 'hidden';
    var data = document.getElementById('data');
    data.style.display = 'block';
}


</script>
</body>
</html>