package com.LearnersAcademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminController() {
		super();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("uName");
		String userPassword = request.getParameter("uPassword");
		ValidateUser valideuser = new ValidateUser();

		if (!valideuser.isValidUser(userName, userPassword)) {
		System.out.println("invalideUser");
			RequestDispatcher reqDis = request.getRequestDispatcher("login.jsp");
			out.println(
					"<h3 style=\"background-color:hsl(9, 100%, 64%);color:white; margin-left:30%; margin-right:30%;\">Invalide Username or Password!!!!!</h3>");
			reqDis.include(request, response);


		} else {
			

			HttpSession session = request.getSession(true);
			session.setAttribute("user", userName);
			RequestDispatcher reqDis = request.getRequestDispatcher("dashboard.jsp");
			reqDis.forward(request, response);
		}
		out.close();
	}
	

}
