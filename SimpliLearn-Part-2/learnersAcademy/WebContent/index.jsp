<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
 /* Style buttons */
.btn {
  background-color: DodgerBlue; /* Blue background */
  border: none; /* Remove borders */
  color: white; /* White text */
  padding: 12px 16px; /* Some padding */
  font-size: 16px; /* Set a font size */
  cursor: pointer; /* Mouse pointer on hover */
}

/* Darker background on mouse-over */
.btn:hover {
  background-color: RoyalBlue;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="new" method="post">
<button class="btn"><i class="fa fa-bars"></i>ADMIN REGISTRATION</button>
</form>
<form action="redirectToLogIn" method="post">
<button class="btn"><i class="fa fa-home"></i>ADMIN LOGIN</button>
</form></div>
</body>
</html>