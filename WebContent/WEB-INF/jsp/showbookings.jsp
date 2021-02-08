<%@page import="com.onlinetutorsystem.domain.Booking"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bookings</title>
<link type="text/css" href="main.css" rel="stylesheet" />
</head>
<style type="text/css">
body {background-color: Lightblue;}
table, tr, td, th{
background-color: seashell;
border: 1px solid grey;
border-colapse: collapse;
width:600px;
padding: 10px;
font-size: 20px;
}</style>
</head>
<body>
	<div align = "center">
	<h1>Show Booking List</h1>
		<%
		List<Booking> booking = (List<Booking>) request.getAttribute("booking");
	%>

	<table>
		<tr>
			<th>Booking ID</th>
			<th>Booking Type</th>
			<th>Tutor ID</th>
			<th>Parent ID</th>
			<th>Action</th>
		</tr>
		<%
			for (Booking b : booking) 
			{
		%>
		<tr>
			<td><%=b.getBookingId()%></td>
			<td><%=b.getBookingType()%></td>
			<td><%=b.getTutorId()%></td>
			<td><%=b.getParentId()%></td>
			<td><a href="delete?bookingId=<%=b.getBookingId()%>">Delete</a>
			</td>
		</tr>
		<%
}
%>
	</table>
	</div>
</body>
</html>