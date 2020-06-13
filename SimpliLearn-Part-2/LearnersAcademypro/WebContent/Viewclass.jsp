<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="dashboard.css">
<link rel="stylesheet" type="text/css" href="viewform.css">
<title>Master List Classes</title>
</head>
<body>
	<c:choose>
		<c:when  test="${sessionScope.login != null}">
			<h3>Master List Classes</h3>
			<span class="error">${exception_all_data_classes}</span>
			<div class="wrap">
			
			<form method="post" action="classes">
	      <input type="hidden" name="action" value="add"/>
	      <button name="addClass">Add Class</button>
	   </form>
	   	<form method="post" action="classes">
	      <input type="hidden" name="action" value="view"/>
	      <button name="ViewAll">View Class</button>
	   </form>
			</div>	
			<div id="main">
    
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
			</c:when>
		<c:otherwise>
			<jsp:forward page="login.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>