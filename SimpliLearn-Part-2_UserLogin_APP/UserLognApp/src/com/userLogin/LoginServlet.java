package com.userLogin;

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
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("uName");
		String userPassword = request.getParameter("uPassword");
		ValidateUser valideuser = new ValidateUser();

		if (valideuser.isValidUser(userName, userPassword)) {

			HttpSession session = request.getSession(true);
			session.setAttribute("user", userName);
			RequestDispatcher reqDis = request.getRequestDispatcher("DashBoard.html");
			reqDis.forward(request, response);

		} else {
			out.println(
					"<h3 style=\"background-color:hsl(9, 100%, 64%);color:white; margin-left:35%; margin-right:35%;\">Invalide Username or Password!!!!!</h3>");
			RequestDispatcher reqDis = request.getRequestDispatcher("Login1.html");
			reqDis.include(request, response);

		}
		out.close();

	}
	

}
