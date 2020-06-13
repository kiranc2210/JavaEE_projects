<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="loginstyle.css">
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<div class="login">
  <h1>Login To Admin Portal</h1>
  <form method="post" action="login">
    <p><input type="text" name="uName" value="" placeholder="Username or Email" required></p>
    <p><input type="password" name="uPassword" value="" placeholder="Password" required></p>
   
    <p class="submit"><input type="submit" name="commit" value="Login"></p>
  </form>
</div>


</body>
