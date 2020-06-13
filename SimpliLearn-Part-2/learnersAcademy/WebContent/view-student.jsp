<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<title>List Of Students</title>
<style>
#main{
 width: 75%;
 margin-left:170px;
}
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: center;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #4CAF50;
	color: white;
}
tr, td {
text-align: center;
	padding: 8px;
}
</style>
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 
	<h2>List Of Students</h2>
	<table>
	<tr>
<th>Student_ID</th>
			<th>Firstname</th>

			<th>Lastname</th>

			<th>Gender</th>
			<th>Date Of Birth</th>

			<th>Date Of Admission</th>

			<th>Address</th>
			<th>Phone</th>

			<th>Email</th>
			<th>Edit Student</th>
			<th>Delete Student</th>
		</tr>
		   <c:forEach var="student" items="${liststds}">
                <tr>
                    <td><c:out value="${student.student_id}" /></td>
                    <td><c:out value="${student.firstname}" /></td>
                    <td><c:out value="${student.lastname}" /></td>
                    <td><c:out value="${student.emial}" /></td>
                     <td><c:out value="${student.gender}" /></td>
                      <td><c:out value="${student.dateOfBirth}" /></td>
                       <td><c:out value="${student.dateOfAdmission}" /></td>
                        <td><c:out value="${student.address}" /></td>
                         <td><c:out value="${student.phone}" /></td>
                    <td>
                    <a href="Student?action=edit&id=<c:out value='${student.student_id}' />">Edit</a></td>
                    <%-- <a href="student?action=edit" name="edit" value="<c:out value='${student.student_id}' />">Edit</a></td>--%> 
                     <td>
                     <a href="Student?action=delete&id=<c:out value='${student.student_id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
		
	</table>
</div>
</body>
</html>

