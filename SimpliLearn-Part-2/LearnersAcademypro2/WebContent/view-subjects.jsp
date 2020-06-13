<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</tr>
		   <c:forEach var="student" items="${liststds}">
                <tr>
                    <td><c:out value="${student.student_id}" /></td>
                    <td><c:out value="${student.firstname}" /></td>
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