package com.LearnersAcademy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user_id = "", user_password = "";	
		
		String uri = "";
		if(!request.getParameter("userid").trim().isEmpty() && request.getParameter("userid").trim()!="" && !request.getParameter("password").trim().isEmpty() && request.getParameter("password").trim()!=""){
			user_id = request.getParameter("userid");
			user_password = request.getParameter("password");	
			
			if(user_id.equalsIgnoreCase("Admin") && user_password.equalsIgnoreCase("Admin")) {
				uri = "./dashboard.jsp";
				
				response.sendRedirect(uri);	
			}
			
			response.sendRedirect("index.jsp?code=error");
		}
	}
}
