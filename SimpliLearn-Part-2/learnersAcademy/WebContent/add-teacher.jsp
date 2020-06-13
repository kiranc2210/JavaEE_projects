<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ADD Teacher</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
  box-sizing: border-box;
}
#main{
 width: 75%;
 margin-left:170px;

}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
 
margin-left:450px
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 20%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 50%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
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
