<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body bgcolor="pink">

	<style>
body {
	font-family: Verdana, sans-serif;
	font-size: 0.8em;
}

div#header,div#content,div#post {
	border: 1px solid grey;
	margin: 5px;
	margin-bottom: 15px;
	padding: 8px;
	background-color: white;
}

div#header,div#footer {
	color: white;
	background-color: #444;
	margin-bottom: 5px;
}
</style>
	<div id="header">
		<center>
			<h1>Welcome</h1>
		</center>

	</div>

	<div id="content">
		<h2>Login</h2>
		<form action="Servlet" method="post">

			<table border="0">


				<tr>
					<td>name :</td>
					<td><input type="text" name="name" /></td>
				</tr>

				<tr>
					<td>password:</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="Check">Beni hatırla<br /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Giriş" /></td>
				</tr>

				<tr>
					<td><input type="button" value="Üye ol"
						onclick="javascript:window.location.href='Register.jsp'" /></td>
				</tr>
			</table>

		</form>

	</div>
</body>
</html>


