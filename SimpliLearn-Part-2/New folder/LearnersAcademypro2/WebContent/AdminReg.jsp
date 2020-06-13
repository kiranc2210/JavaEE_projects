


<%@ page import="com.LearnersAcademy.jsp.utils.*" %>
<h1>Admin Registration Form</h1>

<div class="container">
<div class="row">

<form class="form-horizontal" role="form" method="post" action="register" enctype="multipart/formdata" >
 
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




