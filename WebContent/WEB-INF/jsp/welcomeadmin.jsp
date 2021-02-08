<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="main.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin</title>
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
	<form action="adminlogin" method="post">
		<div>
			<button>Logout</button>
		</div>
	</form>
	<form>
		<div>
			<p> </p>
			<p> </p>
			<p> </p>
		</div>
	</form>
	<form action="tutors" method="get">
		<div>
			<button>View Tutors</button>
		</div>
	</form>
	
	<form>
		<div>
			<p> </p>
			<p> </p>
			<p> </p>
		</div>
	</form>
	<form action="ebook" method="get">
		<div>
			<button>View Study Material</button>
		</div>
	</form>
	</div>

</body>
</html>