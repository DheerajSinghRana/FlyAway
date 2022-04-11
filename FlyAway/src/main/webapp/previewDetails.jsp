<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adminDashboard.jsp"  method=post>
<input type="text" name="username" placeholder="Enter Username"/><br/>
<input type="password" name="password" placeholder="Enter Password"/><br/>
<input type="submit" value="submit"/><br/>

</form>
<%
String source= request.getParameter("source");
String destination= request.getParameter("destination");
String date=request.getParameter("date");
String person=request.getParameter("person");

out.write(source+"&nbsp &nbsp &nbsp"+destination+"&nbsp &nbsp &nbsp"+date+"&nbsp &nbsp &nbsp"+person);
%>
<sql:setDataSource user="system" password="admin"
url="jdbc:oracle:thin:@localhost:1521:XE"
driver="oracle.jdbc.driver.OracleDriver"/>
<sql:update>
insert into flyaway_master(id,source,dest) values(3,'<%=source%>','<%=destination%>')
</sql:update>
<h1></h1>
</body>
</html>