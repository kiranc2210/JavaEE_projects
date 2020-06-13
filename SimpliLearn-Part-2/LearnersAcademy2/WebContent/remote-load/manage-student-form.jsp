<%@ page import="com.LearnersAcademy.jsp.utils.*" %>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
     <!-- Include Functions Tags -->
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
     <!-- Include SQL Tags -->
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<h1>Student Registration Form</h1>

<div class="container">
<div class="row">

<form class="form-horizontal" role="form" action="./StudentController?post=upd" method="post" >
    <div class="form-group">
    <label for="search" class="col-sm-2 control-label">Student ID:</label>
    <div class="col-sm-6">
    <input type="text" name="student_id" class="form-control" value="${student.student_id}" id="studentId" placeholder="seu-mit-12" readonly>
    </div>
    </div>
 
<div class="form-group">
<label for="firstName" class="col-sm-2 control-label">First Name:</label>
<div class="col-sm-6">
<input type="text" name="firstname" class="form-control" id="firstname" value="${student.firstname}">
</div>
</div>
 
<div class="form-group">
<label for="lastName" class="col-sm-2 control-label">Last Name:</label>
<div class="col-sm-6">
<input type="text" name="lastname" class="form-control" id="lastname" value="${student.lastname}">
</div>
</div>
 
 
<div class="form-group">
<label for="dob" class="col-sm-2 control-label">DOB:</label>
<div class="col-sm-6">
<input type="text" name="dob" class="form-control datepicker" id="dob"  value="${student.dateOfBirth}">
</div>
</div>

<div class="form-group">
<label for="userName" class="col-sm-2 control-label">Address:</label>
<div class="col-sm-6">
<textarea class="form-control" id="address" name="address">${student.address}</textarea>
</div>
</div>

<div class="form-group">
<label for="userName" class="col-sm-2 control-label">Guardian Name:</label>
<div class="col-sm-6">
<input type="text" name="guardian" class="form-control" id="guardian" value="${student.guardian}">
</div>
</div>

<div class="form-group">
                    <label for="country" class="col-sm-2 control-label">Select Grade</label>
                    <div class="col-sm-6">
                        <select id="grade" name="grade" class="form-control">
                            <option value="1">one</option>
                            <option value="2">two</option>
                            <option value="3">three</option>
                            <option value="4">four</option>
                            <option value="5">five</option>
                            <option value="6">six</option>
                            <option value="7">seven</option>
                            <option value="8">eight</option>
                            <option value="9">nine</option>
                            <option value="10">ten</option>
                            <option value="11">eleven</option>
                        </select>
                    </div>
</div>
 
<div class="form-group">
<label for="userName" class="col-sm-2 control-label">Phone:</label>
<div class="col-sm-6">
<input type="text" name="phone" class="form-control" id="phone" value="${student.phone}">
</div>
</div>
 
<div class="form-group">
<label for="passwd" class="col-sm-2 control-label">Email:</label>
<div class="col-sm-6">
<input type=email name="email" class="form-control" id="email" value="${student.emial}">
</div>
</div>

 
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<button type="submit" class="btn btn-primary" id="update">Update Student</button>
</div>
</div>
 
<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<a href="./StudentController?action=del&student_id=${student.student_id}" class="btn btn-danger" onclick="return confirm('Delete entry?')">Delete Student</a>
</div>
</div>

</form>


</div><!-- end for class "row" -->
</div><!-- end for class "container" -->