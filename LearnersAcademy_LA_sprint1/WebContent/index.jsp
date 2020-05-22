<%@ page import="com.LearnersAcademy.jsp.utils.*" %>

<%
String message=null;
if(request.getParameter("code")!=null){
message = Functions.loginError(request.getParameter("code").toString());
}
%>


<%@include file="remote-load/public/public-head.jsp" %>
<%@include file="remote-load/public/public-nav.jsp" %>

  <!--   start Login Error Model -->
<% if(message!=null){ %>
<div class="alert alert-danger alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Warning!</strong> <%=message %>
</div>
<%} %>
  <!--   End Login Error Model --> 
  
<%@include file="remote-load/public/public-carousel.jsp" %>



<div class="container-fluid text-center">    
 <div class="row content">
    
 <%@include file="remote-load/public/public-main-contents.jsp" %> 
    
 <%@include file="remote-load/public/public-side-nav-right.jsp" %>
   
</div>
</div>

 <%@include file="remote-load/public/public-footer.jsp" %>

