<%@page import="com.onlinetutorsystem.domain.Textbook"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="main.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Text Book</title>
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
<div align="center">
		<h1>Save Textbook</h1>
		
		<form:form action="addbook" method="post" modelAttribute="ebook">
			<table>
				
				<tr>
					<td>ID:</td>
					<td><form:input path="ebookId" /></td>
				</tr>
				<tr>
					<td>Title:</td>
					<td><form:input path="title" /></td>
				</tr>
				<tr>
					<td>Author:</td>
					<td><form:input path="author" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>