<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>update Student</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="dashboard.css">
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 
<h2>update Student</h2>


<div class="container">
<%request.getParameter("status"); %>
  <form action="Student?action=update-student" method="post">
  <div class="row">
    <div class="col-25">
      <label for="lname">Student_id</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="student_id" placeholder="Your Email" value="<c:out value='${Student.student_id}' />">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="fname">First Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="firstname" placeholder="Your name.." value="<c:out value='${Student.firstname}' />">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="lname">Last Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="lastname" placeholder="Your last name.." value="<c:out value='${Student.lastname}'/>"/>
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Gender</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="gender" placeholder="Your Gender." value="<c:out value='${Student.gender}'/>">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Date Of Birth</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name=dob placeholder="Your Date Of Birth." value="<c:out value='${Student.dateOfBirth}' />">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Date Of Admission</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="doa" placeholder="Your Date Of Admission." value="<c:out value='${Student.dateOfAdmission}' />">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Address</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="address" placeholder="Your Address." value="<c:out value='${Student.address}' />">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Phone Number</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="phone" placeholder="Your Phone Number" value="<c:out value='${Student.phone}' />">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="lname">Email</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="email" placeholder="Your Email" value="<c:out value='${Student.emial}' />">
    </div>
  </div>
  
  <div class="row">
    <input type="submit" value="Update">
  </div>
  </form>
</div>
</div>
</body>
</html>
