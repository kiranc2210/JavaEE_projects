
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
     <!-- Include Functions Tags -->
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
     <!-- Include SQL Tags -->
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page import="com.LearnersAcademy.jsp.utils.*" %>

    <div class="col-sm-2 sidenav rightNav" style="overflow:scroll;">
  
		<c:forEach items="${noteList}" var="note">
		<div class="well">
		<h3>${note.note_topic}</h3>
		<p class="lead">${note.note_body}</p>
		<p class="label label-warning">Expired on :- ${note.getDateOfExpire()}</p>
		</div>
		</c:forEach>
    </div>


