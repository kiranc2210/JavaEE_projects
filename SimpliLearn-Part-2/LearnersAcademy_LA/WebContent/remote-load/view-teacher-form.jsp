
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
     <!-- Include Functions Tags -->
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
     <!-- Include SQL Tags -->
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     
<div class="container-fluid">

<h1>VIEW STUDENT DETAILS</h1>
<p>Click on student id in marks colomn to view marks</p>
<p>Click on Student name to edit details</p>
		<table class="table table-striped table-bordered" cellspacing="0" width="100%" id="dattable" style="overflow:hidden">
		
		<thead>
		<tr data-toggle="tooltip" title="Click To Edit !" data-placement="left">
			<th>Name</th>
			<th>FIELD</th>
			<th>GENDER</th>
			<th>DOB</th>
			<th>DOA</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
			<th>REMOVE</th>
		</tr>
		</thead>
		
		<tfoot>
		<tr data-toggle="tooltip" title="Click To Edit !" data-placement="left">
			<th>Name</th>
			<th>FIELD</th>
			<th>GENDER</th>
			<th>DOB</th>
			<th>DOA</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
			<th>REMOVE</th>
		</tr>
		</tfoot>
		
		  <tbody>

		

<c:forEach items="${teacherList}" var="teacher">
		<tr>
			<td>
				<a href="#">
				<span class="label label-warning"><U> ${teacher.firstname} ${teacher.lastname}</U></span>
				</a>
			</td>
			
			<td>
				${teacher.fieldOfStudy}
			</td>
			
			<td>
				${teacher.gender}
				
			</td>
			
			<td>
				${teacher.dob}
			</td>		
			
			<td>
				${teacher.doa}
			</td>			
				
			<td>
				${teacher.address}
			</td>


				
			<td>
				${teacher.phone}
			</td>					
				  
			<td style="text-align:center">
			<a href="./MarksController?student_id=${teacher.teacher_id}" onclick="return confirm('Are you sure?')">
			<span class="label label-danger"><u>${teacher.teacher_id}</u></span>
			</a>
			</td>
		
		</tr>
		</c:forEach>

		
		
		</tbody>
		</table>		

</div>
