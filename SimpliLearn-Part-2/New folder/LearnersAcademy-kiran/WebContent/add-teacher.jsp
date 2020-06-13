<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ADD Teacher</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="dashboard.css">
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 

<h2>ADD Teacher</h2>


<div class="container">
<%request.getParameter("status"); %>
  <form action="Teacher?action=register-teacher" method="post">
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
      <input type="text" id="lname" name="gender" placeholder="Your Gender.">
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
      <label for="lname">Date Of Admission</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="doa" placeholder="Your Date Of Admission.">
    </div>
  </div>
   <div class="row">
    <div class="col-25">
      <label for="lname">Field Of Study</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="fostudy" placeholder="Field Of Study..">
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
      <label for="lname">Phone Number</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="phone" placeholder="Your Phone Number">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Email</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="email" placeholder="Your Email">
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
