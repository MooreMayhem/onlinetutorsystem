<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="main.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parents Login</title>
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
<div align= "center" >
	<h2>Welcome Parents!! Please Log In</h2>
	<form action="parentlogin" method="post">
		<div>
			<div>
				<label>Login</label> <input type="text" name="login">
			</div>

		<div>
			<p> </p>
			<p> </p>
			<p> </p>
		</div>

			<div>
				<label>Password</label> <input type="password" name="password">
			</div>
			<div>
				<h6 style="color: red">${msg}</h6>
			</div>
			<div>
				<button>Next>></button>
			</div>
		</div>
	</form>
	</div>
</body>
</html>