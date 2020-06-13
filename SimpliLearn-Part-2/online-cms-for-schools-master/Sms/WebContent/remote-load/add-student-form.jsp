<%@ page import="com.LearnersAcademy.jsp.utils.*" %>
<h1>Student Registration Form</h1>

<div class="container">
<div class="row">

<form class="form-horizontal" role="form" method="post" action="./StudentController?post=add" enctype="multipart/formdata" >
 
<div class="form-group">
<label for="firstName" class="col-sm-2 control-label">First Name:</label>
<div class="col-sm-6">
<input type="text" name="firstname" class="form-control" id="firstName" placeholder="First Name">
</div>
</div>
 
<div class="form-group">
<label for="lastName" class="col-sm-2 control-label">Last Name:</label>
<div class="col-sm-6">
<input type="text" name="lastname" class="form-control" id="lastName" placeholder="Last Name">
</div>
</div>
 
<div class="form-group">
<label for="" class="col-sm-2 control-label">Gender:</label>
<div class="col-sm-6">
<label class="radio-inline">
<input type="radio" name="gender" id="gender1" value="male">Male
</label>
<label class="radio-inline">
<input type="radio" name="gender" id="gender2" value="female">Female
</label>
 
</div>
</div>
 
<div class="form-group">
<label for="dob" class="col-sm-2 control-label">DOB:</label>
<div class="col-sm-6">
<input type="text" name="dob" class="form-control datepicker" id="dob" placeholder=" Date of Birth">
</div>
</div>

<div class="form-group">
<label for="date of admission" class="col-sm-2 control-label">DOA:</label>
<div class="col-sm-6">
<input type="text" name="doa" class="form-control datepicker" id="doa" placeholder=" Date of Admission">
</div>
</div>

<div class="form-group">
<label for="address" class="col-sm-2 control-label">Address:</label>
<div class="col-sm-6">
<textarea class="form-control" id="address" name="address"></textarea>
</div>
</div>

<div class="form-group">
<label for="email" class="col-sm-2 control-label">Email:</label>
<div class="col-sm-6">
<input type="email" name="email" class="form-control" id="email" placeholder="Email">
</div>
</div>

<div class="form-group">
<label for="phone" class="col-sm-2 control-label">Phone (Home):</label>
<div class="col-sm-6">
<input type="text" name="phone" class="form-control" id="phone" placeholder="Phone number">
</div>
</div>

<div class="form-group">
<label for="userName" class="col-sm-2 control-label">Guardian Name:</label>
<div class="col-sm-6">
<input type="text" name="guardian" class="form-control" id="guardian" placeholder="Guardian Name">
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
<label for="passwd" class="col-sm-2 control-label">Password:</label>
<div class="col-sm-6">
<input type="password" name="password" class="form-control" id="password" placeholder="Password">
</div>
</div>

<div class="form-group">
<div class="col-sm-offset-2 col-sm-10">
<input type="submit" class="btn btn-primary" id="register" value="Register">
</div>
</div>
 
</form>
 
</div>
</div>




