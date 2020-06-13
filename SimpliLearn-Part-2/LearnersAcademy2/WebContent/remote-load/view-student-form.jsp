
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
			<th>GRADE</th>
			<th>DOA</th>
			<th>ADDRESS</th>
			<th>GENDER</th>
			<th>GUARDIAN</th>
			<th>PHONE</th>
			
			<th>MARKS</th>
		</tr>
		</thead>
		
		<tfoot>
		<tr data-toggle="tooltip" title="Click To Edit !" data-placement="left">
			<th>Name</th>
			<th>GRADE</th>
			<th>DOA</th>
			<th>ADDRESS</th>
			<th>GENDER</th>
			<th>GUARDIAN</th>
			<th>PHONE</th>
			
			<th>MARKS</th>
		</tr>
		</tfoot>
		
		  <tbody>

		

<c:forEach items="${studList}" var="student">
		<tr>
			<td>
				<a href="StudentController?by=admin&student_id=${student.student_id}">
				<span class="label label-warning"><U> ${student.firstname} ${student.lastname}</U></span>
				</a>
			</td>
			
			<td>
				${student.grade}
			</td>
			
			<td>
				${student.dateOfAdmission}
			</td>
			
			<td>
				${student.address}
			</td>		
			
			<td>
				${student.gender}
			</td>			
				
			<td>
				${student.guardian}
			</td>

			<td>
				${student.phone}
			</td>
									
				  
			<td style="text-align:center">
			<a href="./MarksController?by=admin&s_id=${student.student_id}">
			<span class="label label-warning"><u>${student.student_id}</u></span>
			</a>
			</td>
		
		</tr>
		</c:forEach>

		
		
		</tbody>
		</table>		

</div>

