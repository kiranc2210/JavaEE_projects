<div class="col-sm-9 text-left"> 
      <h1>Welcome Sri Sanghabodhi Central College</h1>
      <p>
"Sri Sanghabodhi Central College" is a one of large school in Gampaha District. 
It is situated in Colombo-Kndy Highway close to Nittambuwa town and it was started in 1942
by Prime Minister Sirimawo Bandaranayake.  
    
      </p>
 <img src="./images/a.jpg" width="300" height="300" alt="Logo" style="text-align:center">      
      <hr>
      <h3>Info</h3>
      <p>
Sri Sanghabodhi Central College 
is an English and Sinhala medium school with grades from 6-13. The current student population of school is nearly 3000      
      </p>
     
    </div>

<!--Start Login Model-->
<div class="modal fade" id="myModal" role="dialog" style="margin-top:40px;">
<div class="modal-dialog">
<div class="modal-content">

        <div class="modal-header" >
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <img src="images/login.gif" width="100px" height="100px">
          	
          <h3>Login Here!</h3>
        </div>

        <div class="modal-body" style="padding:20px 30px;">
        <form role="form" action="./Login" method="post">
            <div class="form-group">
              <label for="userLevel"><span class="fa fa-user"></span> User Level</label>
              <select class="form-control" name="level">
              <option value="admin">Principal</option>
              <option value="teacher">Teacher</option>
              <option value="student">Student</option>
              </select>             
            </div>
            <div class="form-group">
              <label for="userid"><span class="fa fa-user"></span> User ID</label>
              <input type="text" name="userid" class="form-control" id="userid" placeholder="User Id">
            </div>
            <div class="form-group">
              <label for="password"><span class="fa fa-key"></span> Password</label>
              <input type="text" name="password" class="form-control" id="password" placeholder="user password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-primary btn-block"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</button>
        </form>
        </div>

        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
          <span class="fa fa-remove"></span> Cancel
          </button>
          <p>Forgot <a href="#">Password?</a></p>
        </div>

</div>
</div>
</div><!--Ends Login Model-->    