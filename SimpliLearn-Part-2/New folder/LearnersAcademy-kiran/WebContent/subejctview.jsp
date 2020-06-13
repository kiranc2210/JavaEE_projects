<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<div class="row">
    <div class="col-25">
       <label for="fname">Assign Subjects</label>
    </div>
   
    <div class="col-75">
  
  
  
<c:forEach var="subs" items="${listsubjs}">
      <input type="text" name="<c:out value='${subs.sub_name}' /> "><c:out value='${subs.sub_name}' /><br />
    
    
    </c:forEach>
   </div>
  </div>