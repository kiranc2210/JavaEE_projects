package com.LearnersAcademy.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("logout") != null) {
			request.getSession(false).invalidate();
			response.sendRedirect("login.jsp");
		} else if (request.getParameter("login") != null) {
			
			String username=request.getParameter("username");
		String password=request.getParameter("password");
			try {
				if(username.isEmpty() && password.isEmpty()) {
					request.setAttribute("error_login", "Fields Should not be empty");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else if(username.isEmpty() && ! password.isEmpty()) {
					request.setAttribute("error_login", "Username Should not be Empty");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else if(! username.isEmpty() && password.isEmpty()) {
					request.setAttribute("error_login", "Password Should not be Empty");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				
				else if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
					request.setAttribute("success_login", "Login Successful");
					request.getSession(true).setAttribute("login", "true");
					request.getRequestDispatcher("dashboard.jsp").forward(request, response);
				} else {
					request.setAttribute("error_login", "Invalid usename and password!!");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				request.setAttribute("error_login", e.getMessage());
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		}
	}

}
