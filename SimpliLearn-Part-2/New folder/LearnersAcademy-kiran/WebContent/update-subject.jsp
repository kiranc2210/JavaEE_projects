<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="dashboard.css">
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 

<h2>Update Subjects</h2>


<div class="container">

<form action="Subject?action=register-subject" method="post">
  <div class="row">
    <div class="col-25">
      <label for="fname">Subject Id</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="subname" placeholder="Enter subjectname" value="<c:out value='${subject.sub_id}' />">
    </div>
  </div>
   <div class="row">
    <div class="col-25">
      <label for="fname">Subject Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="subname" placeholder="Enter subjectname" value="<c:out value='${subject.sub_name}' />">
    </div>
  </div>
  <div class="row">

    <input type="submit" value="Submit">
   
  </div>
  </form>
  </div>
  </div>
</body>
</html>