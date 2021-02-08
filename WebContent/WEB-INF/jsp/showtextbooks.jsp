<%@page import="com.onlinetutorsystem.domain.Textbook"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Textbooks</title>
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
	<h1>Textbooks</h1>

	<%
		List<Textbook> textbooks = (List<Textbook>)request.getAttribute("ebook");
	%>

	<table>
		<tr>
			<th>Book ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Action</th>
		</tr>
		<%
			for (Textbook t : textbooks)
			{
		%>
		<tr>
			<td><%=t.getebookId()%></td>
			<td><%=t.getTitle()%></td>
			<td><%=t.getAuthor()%></td>
			<td><a href="editbook?ebookId=<%=t.getebookId()%>">Edit</a>
			&nbsp;&nbsp;
			<td><a href="deletebook?ebookId=<%=t.getebookId()%>">Delete</a>
			</td>
		</tr>
		<%
}
%>
	</table>
	</div>
</body>
</html>