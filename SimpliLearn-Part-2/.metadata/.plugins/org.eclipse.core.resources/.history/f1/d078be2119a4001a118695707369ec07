				<%@page import="com.sms.jsp.utils.*" %>
				<%
				String name ="",userID="";
				name = Functions.showName(request, response);
				userID = Functions.showID(request, response);
				%>

<!DOCTYPE html>
<!-- Admin Area NavBar -->
<html lang="en">
<head>
  <title>school-Management-system</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="./css/bootstrap.min.css">
  <link rel="stylesheet" href="./font-awesome/css/font-awesome.css">
  <link rel="stylesheet" href="./css/custome.css">
  <script src="./js/jquery.min.js"></script>
  <script src="./js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="plugins/datatable/dataTables.bootstrap.min.css" />
  <style>
   
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">School Management System</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i>&nbsp;Home</a></li>
        <li class="label label-warning"><a href="#" ><i class="fa fa-key" aria-hidden="true"></i>&nbsp;UserID = <%=userID %></a></li>
        <li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#">
			<span class="fa fa-user-o" ></span>&nbsp;
				<%=name %>
			<span class="caret"></span></a>
			<ul class="dropdown-menu">
			  <li><a href="logout.jsp"><span class="fa fa-sign-out " ></span>&nbsp;Log out</a></li>
			</ul>
		</li>
      </ul>
    </div>
  </div>
</nav>
<!-- Admin Area NavBar close-->