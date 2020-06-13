
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
              <label for="userid"><span class="fa fa-user"></span> User ID</label>
              <input type="text" name="userid" class="form-control" id="userid" placeholder="User Id">
            </div>
            <div class="form-group">
              <label for="password"><span class="fa fa-key"></span> Password</label>
              <input type="text" name="password" class="form-control" id="password" placeholder="user password">
            </div>
            
              <button type="submit" class="btn btn-primary btn-block"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</button>
        </form>
        </div>

        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal">
          <span class="fa fa-remove"></span> Cancel
          </button>
   
        </div>

</div>
</div>
</div><!--Ends Login Model-->    