<%@page import="com.onlinetutorsystem.domain.Tutor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tutors</title>
<link type="text/css" href="main.css" rel="stylesheet" />
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
	<h1>Show Tutor List</h1>
		<%
		List<Tutor> tutors = (List<Tutor>) request.getAttribute("tutor");
	%>

	<table>
		<tr>
			<th>Tutor ID</th>
			<th>Tutor Name</th>
			<th>Subject</th>
			<th>City</th>
			<th>E-Mail</th>
			<th>Password</th>
			<th>Admin ID</th>
			<th>E-Book ID</th>
			<th>Action</th>
		</tr>
		<%
			for (Tutor t : tutors) 
			{
		%>
		<tr>
			<td><%=t.getTutorId()%></td>
			<td><%=t.getTutorName()%></td>
			<td><%=t.getSubject()%></td>
			<td><%=t.getCity()%></td>
			<td><%=t.getEmail()%></td>
			<td><%=t.getPassword()%></td>
			<td><%=t.getAdminId()%></td>
			<td><%=t.getEbookId()%></td>
			<td><a href="edit?tutorId=<%=t.getTutorId()%>">Edit</a>
			&nbsp;&nbsp;
			<td><a href="delete?tutorId=<%=t.getTutorId()%>">Delete</a>
			</td>
		</tr>
		<%
}
%>
	</table>
	<button onClick="welcomeparent">Back</button>
	</div>
</body>
</html>