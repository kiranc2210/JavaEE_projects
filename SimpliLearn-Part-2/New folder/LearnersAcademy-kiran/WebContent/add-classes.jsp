<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="dashboard.css">

</head>
<body>
<div id="main">
    <%@ include file="admin-nav.jsp" %> 

<h2>ADD Classes</h2>


<div class="container">
<%request.getParameter("status"); %>
<form action="Class?action=register-classes" method="post">
  <div class="row">
    <div class="col-25">
      <label for="fname">classes Name</label>
    </div>
    <div class="col-75">
    
      <input type="text" id="fname" name="classname" placeholder="Enter class name." required>
    </div>
  </div>
 <div class="row">
    <div class="col-25">
      <label for="fname">Assign Subjects to class</label>
    </div>
    <c:forEach var="sub" items="${listsubjs}">
    <div class="col-75">
    
      <input type="checkbox" id="fname" name="<c:out value="${sub.sub_name}" />"  required><c:out value="${sub.sub_name}" /> <br>
    </div>
    </c:forEach>
  </div>

  <div class="row">

    <input type="submit" value="Submit">
   
  </div>
  </form>
  </div>
  </div>
</body>
</html>