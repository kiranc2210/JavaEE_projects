<h1>Notice</h1>

<form role="form" action="./NoticeController?post=add" method="post">
            <div class="form-group">
              <label for="topic"><span class="fa fa-header"></span> Topic</label>
              <input type="text" class="form-control" id="topic" placeholder="Topic" name="topic">
            </div>
            <div class="form-group">
              <label for="notice"><span class="fa fa-sticky-note"></span> Notice:</label>
              <textarea class="form-control"  cols="20" name="notice"></textarea>
            </div>
            <div class="form-group">
              <label for="topic"><span class="fa fa-header"></span> Topic</label>
              <input type="date" class="form-control" id="topic" placeholder="Topic" name="exp_date">
            </div>
              <button type="submit" class="btn btn-primary btn-block"><i class="fa fa-sign-in" aria-hidden="true"></i> Post</button>
</form>