<%@ page import="javax.servlet.http.HttpSession" %>
<%
HttpSession ses = request.getSession(false);
if (ses != null) 
{
	 ses.removeAttribute("User-Type");
	 ses.removeAttribute("User-ID");
     ses.invalidate();

}
response.sendRedirect("./index.jsp?logut=true");
%>