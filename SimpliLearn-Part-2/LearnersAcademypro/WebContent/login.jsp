<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="loginstyle.css">
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
.wrap {
    width: 100%;
}

.wrap table {
    width: 100%;
    table-layout: fixed;
    
}


table tr td {
    padding: 5px;
    border: 1px solid #bebebe;
    width: 50px;
    word-wrap: break-word;
}

table.head tr td {
    background: #eee;
}

.inner_table {
    height: 200px;
    overflow-y: auto;
	    
}


span.error {
	color: red;
}

</style>
</head>
<body>
<div class="login">
<h3>Login Learners Academy</h3>
	<c:choose>
		<c:when  test="${sessionScope.login == null}">
  <form method="post" action="login">
    <span class="error">${error_login}</span><br/>
    <p><input type="text" name="username" value="" placeholder="Username or Email"></p>
    <p><input type="password" name="password" value="" placeholder="Password"></p>
    <p class="submit"><input type="submit" name="login" value="Login"></p>
  </form>
		</c:when>
		<c:when  test="${sessionScope.login != null}">
		<%response.sendRedirect("dashboard.jsp"); %>
		</c:when>
		<c:otherwise>
			Please close the browser and try again.
		</c:otherwise>
	</c:choose>
</div>


</body>
