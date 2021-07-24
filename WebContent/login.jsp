<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>

</head>
<body>


	<div align="center">
		<h4>
			<strong>LOGIN PAGE</strong>
		</h4>

		<form action="UserServlet" method="post">
			<table>
				<tr>
					<td>USER NAME:</td>
					<td><input type="text" name="username"></td>
				</tr>

				<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="LOGIN"></td>
				</tr>
			</table>
		</form>
	</div>
</html>