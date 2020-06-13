<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="dashboard.css">
<link rel="stylesheet" type="text/css" href="viewform.css">
</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 
	<h2>List Of Classes</h2>
	<table>
	<tr>
<th>ClassId</th>
			<th>ClassName</th>
			<th>Edit Class</th>
			<th>Delete Class</th>

		
		</tr>
		   <c:forEach var="cls" items="${listclss}">
                <tr>
                    <td><c:out value="${cls.c_id}" /></td>
                    <td><c:out value="${cls.c_name}" /></td>
                    
                  
                    <td>
                    <a href="Class?action=edit&id=<c:out value='${cls.c_id}' />">Edit</a></td>
                    <%-- <a href="student?action=edit" name="edit" value="<c:out value='${student.student_id}' />">Edit</a></td>--%> 
                     <td>
                     <a href="Class?action=delete&id=<c:out value='${cls.c_id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
		
	</table>
</div>
</body>
</html>