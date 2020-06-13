<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ADD Student</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="dashboard.css">
<style>
.container {
width:85%;
  background-image: url("bgimage.jpg");
 background-size: cover;
background-repeat:no-repeat;
margin-left:8%;
}

label{
color:white;
}
</style>
</head>
<body>
<div id="main">
  

<h2>ADD Student</h2>


<div class="container">
<%request.getParameter("status"); %>
  <form action="Student?action=register-Student" method="post">
  <div class="row">
    <div class="col-25">
      <label for="fname">First Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="firstname" placeholder="Your name..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="lname">Last Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="lastname" placeholder="Your last name..">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Gender</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="Gender" placeholder="Your Gender.">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Date Of Birth</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name=dob placeholder="Your Date Of Birth.">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Address</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="address" placeholder="Your Address.">
    </div>
  </div>
    
    <div class="row">
    <div class="col-25">
      <label for="lname">Assign to Class</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="class" placeholder="Assign to class">
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
