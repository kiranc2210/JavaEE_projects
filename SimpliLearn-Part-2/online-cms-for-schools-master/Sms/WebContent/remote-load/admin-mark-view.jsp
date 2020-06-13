
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

<!--/marks_id , sinhala, english, tamil, mathematics, science, computer_science, "
		//+ "commerce, music, dancing, drawing, health, geography, history, religion
	-->	
				 <tr>
					 <td>Sinhala</td> 
					 <td>${mymark.sinhala}</td>
				 </tr>
				 
				  <tr>
					 <td>English</td>
					 <td>${mymark.english}</td>
				 </tr>
				 
				  <tr>
					<td>Tamil</td> 
					 <td>${mymark.tamil}</td>
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
				 
				  <tr>
					 <td>health</td>
					 <td>${mymark.health}</td>
				 </tr>
				 
				  <tr>
					   <td>geography</td>
					 <td>${mymark.geography}</td>
				 </tr>
				 
				  <tr>
					<td>history</td>
					 <td>${mymark.history}</td>
				 </tr>
				 
				  <tr>
					  <td>religion</td>
					 <td>${mymark.religion}</td>
				 </tr>
 
		</tbody>
		</table>		

</div>

