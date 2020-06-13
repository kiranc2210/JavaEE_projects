
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
					 <td>Sinhala</td> 
					 <td></td>
				 </tr>
				 
				  <tr>
					 <td>English</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					<td>Tamil</td> 
					 <td></td>
				 </tr>
				 
				  <tr>
					<td>Mathematics</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					  <td>Science</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					 <td>Commerce</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					   <td>Computer_science</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					 <td>music</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					   <td>dancing</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					   <td>drawing</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					 <td>health</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					   <td>geography</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					<td>history</td>
					 <td></td>
				 </tr>
				 
				  <tr>
					  <td>religion</td>
					 <td></td>
				 </tr>
 
		</tbody>
		</table>		

</div>

