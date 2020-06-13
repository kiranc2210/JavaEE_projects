<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Admin Login</title>
</head>
<body>

	<div align="center">
<h1>LOGIN FORM</h1>

		<form action="login" method="post">


			<table border="1" cellpadding="5">

				<tr>
					<th>Admin Email:</th>
					<td><input type="text" name="email" size="45" /></td>
				</tr>
				<tr>
					<th>User Password:</th>
					<td><input type="text" name="password" size="45" /></td>
				</tr>
				 <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Login" />
            	</td>
            </tr>
			</table>



		</form>
	</div>
</body>
</html>
