package com.LearnersAcademy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StudentController
 */
@WebServlet("/students")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = ((String) request.getSession(false).getAttribute("login"));
		if (request.getParameter("logout") != null) {
			request.getSession(false).invalidate();
			response.sendRedirect("login.jsp");
		} else if (login != null && login.equals("true")) {
			if (request.getParameter("action") == null) {
				response.sendRedirect("main.jsp");
			} else if (request.getParameter("action").equals("display")) {
				doDisplay(request, response);
			} else if (request.getParameter("action").equals("insert")) {
				doInsert(request, response);
			} else if (request.getParameter("action").equals("delete")) {
				doDelete(request, response);
			} else if (request.getParameter("action").equals("update")) {
				doUpdate(request, response);
			} else {
				response.sendRedirect("login.jsp");
			}
		}
	}

	public void doDisplay(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

	}

	public void doInsert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	// TODO doUpdate in student controller
	public void doUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}	

}
