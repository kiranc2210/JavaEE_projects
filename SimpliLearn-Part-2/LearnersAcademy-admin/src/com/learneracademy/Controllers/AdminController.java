package com.learneracademy.Controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminController() {
		super();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		String userName = request.getParameter("uName");
		String userPassword = request.getParameter("uPassword");
		System.out.printf(userName,userPassword);
		
	if(userName.equalsIgnoreCase("Admin") && userPassword.equalsIgnoreCase("Admin")) {
		System.out.println("successful");
		RequestDispatcher dispatcher= request.getRequestDispatcher("dashborad");
		request.setAttribute("username",userName);
		dispatcher.forward(request, response);
	}else {
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("login");
		
	}

		
	}

}
