<!DOCTYPE html>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
     <!-- Include Functions Tags -->
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
     <!-- Include SQL Tags -->
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     
     <%
     
    	 String student_id = "";
     if(request.getParameter("s_id")!=null || request.getParameter("s_id")!=""){
    	 student_id = request.getParameter("s_id");
     }else{
    	HttpSession ses = request.getSession();
    	student_id = ses.getAttribute("std_id").toString();
     }
    	 
     %>
     
     
<div class="container-fluid">

<h1>ADD AND EDIT STUDENT'S MARKS</h1>
<c:choose>
<c:when test="${code == 1 }">
	<div class="alert alert-success">
	 	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
		<p class="lead">Student Mark Successfully added..!</p>
	</div>
</c:when>
</c:choose>



<p>Fill below form with relevent subject of the student <%=student_id%></p>

<form action="./MarksController?post=add" method="post">
		<table class="table table-striped table-bordered" cellspacing="0" width="100%" id="dattable" style="overflow:hidden">
<thead>
	<tr data-toggle="tooltip" title="Click To Edit !" data-placement="left">
		<th>Subject</th>
		<th>Marks</th>	 
	</tr>
	</thead>
	<tfoot>
	<tr>
		<th>Subject</th>
		<th>Marks</th> 
	</tr>
</tfoot>
		
		  <tbody>
	
				 <tr>
					 <td>Student_name</td> 
					 <td><input type="text" name="sinhala" value="${mymark.student_name}"></td>
				 </tr>
				 
				  <tr>
					 <td>English</td>
					 <td><input type="text" name="english" value="${mymark.english}"></td>
				 </tr>
				 
				  <tr>
					<td>Kannada</td> 
					 <td><input type="text" name="tamil" value="${mymark.kannada}" ></td>
				 </tr>
				 
				  <tr>
					<td>Mathematics</td>
					 <td><input type="text" name="math" value="${mymark.mathematics}" ></td>
				 </tr>
				 
				  <tr>
					  <td>Science</td>
					<td><input type="text" name="science" value="${mymark.science}"></td>
				 </tr>
				 
				  <tr>
					 <td>Commerce</td>
					 <td><input type="text" name="commerce" value="${mymark.commerce}"  ></td>
				 </tr>
				 
				  <tr>
					   <td>Computer_science</td>
					<td><input type="text" name="computer" value="${mymark.computer_science}"  ></td>
				 </tr>
				 
				  <tr>
					 <td>music</td>
					<td><input type="text" name="music" value="${mymark.music}"  ></td>
				 </tr>
				 
				  <tr>
					   <td>dancing</td>
					 <td><input type="text" name="dancing" value="${mymark.dancing}"  ></td>
				 </tr>
				 
				  <tr>
					   <td>drawing</td>
					<td><input type="text" name="drawing" value="${mymark.drawing}"  ></td>
				 </tr>
	
 				
		</tbody>		
		</table>
			
				<input type="text" name="student_id" value="<%=student_id%>" readonly hidden="hidden">
				 <div class="form group">
				 <input type="submit" value="save" name="submit" class="btn btn-primary btn-block">
				 </div>	
				 <br><br>
</form>

</div>

