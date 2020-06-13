
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
     <!-- Include Functions Tags -->
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
     <!-- Include SQL Tags -->
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@page import="com.LearnersAcademy.jsp.utils.*" %>
     <%@page import="java.util.*" %>
          <%@page import="com.LearnersAcademy.controller.MarksController" %>
             <%@page import="com.LearnersAcademy.model.Marks" %>

     <%
    	 String student_id = request.getParameter("s_id");
     %>
<div class="container-fluid">

<h1>VIEW STUDENT MARKS</h1>
<div class="row">
	<div class="col-md-6 col-sm-6">
	<button onclick="pdfToHTML()" class="btn btn-warning"><i class="fa fa-print" aria-hidden="true"></i>&nbsp;Print</button>
	</div>
</div>

<div id="report">	
<div class="row">
	<div class="col-md-8 col-sm-8">
	<h3 class="lead">Students Marks Sheet</h3>
	<p>Student Name:- ${std.getFirstname()}&nbsp;${std.getLastname()}</p>
	<p>Student ID:- ${std.getStudent_id()}</p>
	<p>Student Grade:- ${std.getGrade()}</p>		
	</div>
	<div class="col-md-4 col-sm-4">
	</div>
</div>
<hr>
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
					 <td>Student_Name</td> 
					 <td>${mymark.student_name}</td>
					 
				 </tr>
				 
				  <tr>
					 <td>English</td>
					 <td>${mymark.english}</td>
				 </tr>
				 
				  <tr>
					<td>Kannada</td> 
					 <td>${mymark.kannada}</td>
				 </tr>
				 
				  <tr>
					<td>Mathematics</td>
					 <td>${mymark.mathematics}</td>
				 </tr>
				 
				  <tr>
					  <td>Science</td>
					 <td>${mymark.science}</td>
				 </tr>
				 
				  <tr>
					 <td>Commerce</td>
					 <td>${mymark.commerce}</td>
				 </tr>
				 
				  <tr>
					   <td>Computer_science</td>
					 <td>${mymark.computer_science}</td>
				 </tr>
				 
				  <tr>
					 <td>music</td>
					 <td>${mymark.music}</td>
				 </tr>
				 
				  <tr>
					   <td>dancing</td>
					 <td>${mymark.dancing}</td>
				 </tr>
				 
				  <tr>
					   <td>drawing</td>
					 <td>${mymark.drawing}</td>
				 </tr>
				 
			
 
		</tbody>
		</table>		
</div>

</div>
</html>