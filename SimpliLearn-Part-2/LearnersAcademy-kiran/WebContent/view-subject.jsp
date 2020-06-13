<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<title>List Of Subject</title>
<link rel="stylesheet" type="text/css" href="dashboard.css">
<link rel="stylesheet" type="text/css" href="viewform.css">
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 
	<h2>List Of Subjects</h2>
	<table>
	<tr>
<th>Subject_ID</th>
			<th>SubName</th>
			<th>Edit Subject</th>
			<th>Delete Subject</th>

		
		</tr>
		   <c:forEach var="sub" items="${listsubjs}">
                <tr>
                    <td><c:out value="${sub.sub_id}" /></td>
                    <td><c:out value="${sub.sub_name}" /></td>
                    
                  
                    <td>
                    <a href="Subject?action=edit&id=<c:out value='${sub.sub_id}' />">Edit</a></td>
                    <%-- <a href="student?action=edit" name="edit" value="<c:out value='${student.student_id}' />">Edit</a></td>--%> 
                     <td>
                     <a href="Subject?action=delete&id=<c:out value='${sub.sub_id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
		
	</table>
</div>
</body>
</html>