<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<title>List Of Students</title>
<link rel="stylesheet" type="text/css" href="dashboard.css">
<link rel="stylesheet" type="text/css" href="viewform.css">
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
<th>Field Of Study</th>
			<th>Address</th>
			<th>Phone</th>

			<th>Email</th>
			<th>Edit Teacher</th>
			<th>Delete Teacher</th>
		</tr>
		   <c:forEach var="teacher" items="${listteachers}">
                <tr>
                    <td><c:out value="${teacher.teacher_id}" /></td>
                    <td><c:out value="${teacher.firstname}" /></td>
                    <td><c:out value="${teacher.lastname}" /></td>
                    <td><c:out value="${teacher.email}" /></td>
                     <td><c:out value="${teacher.gender}" /></td>
                      <td><c:out value="${teacher.dob}" /></td>
                       <td><c:out value="${teacher.doa}" /></td>
                        <td><c:out value="${teacher.fieldOfStudy}" /></td>
                        <td><c:out value="${teacher.address}" /></td>
                         <td><c:out value="${teacher.phone}" /></td>
                    <td>
                    <a href="Teacher?action=edit&id=<c:out value='${teacher.teacher_id}' />">Edit</a></td>
                    <%-- <a href="student?action=edit" name="edit" value="<c:out value='${student.student_id}' />">Edit</a></td>--%> 
                     <td>
                     <a href="Teacher?action=delete&id=<c:out value='${teacher.teacher_id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
		
	</table>
</div>
</body>
</html>

