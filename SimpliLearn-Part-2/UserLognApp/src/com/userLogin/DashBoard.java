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

/**
 * Servlet implementation class DashBoard
 */
@WebServlet("/DashBoard")
public class DashBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DashBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		ValidateUser valideuser = new ValidateUser();
		HttpSession session = request.getSession(true);

		String usr = (String) session.getAttribute("user");

		String pwd = (String) session.getAttribute("password");
		if (usr != null && usr != "") {
			if (valideuser.isValidUser(usr, pwd)) {

				RequestDispatcher reqDis = request.getRequestDispatcher("DashBoard.html");
				reqDis.forward(request, response);

			} else {
				out.println(
						"<h3 style=\"background-color:hsl(9, 100%, 64%);color:white; margin-left:35%; margin-right:35%;\">Invalide Username or Password!!!!!</h3>");
				RequestDispatcher reqDis = request.getRequestDispatcher("Login1.html");
				reqDis.include(request, response);

			}
		}
	}

}
