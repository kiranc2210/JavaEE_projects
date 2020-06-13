package com.LearnersAcademy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LearnersAcademy.dao.ClassDAOI;
import com.LearnersAcademy.dao.ClassDAOImpl;
import com.LearnersAcademy.model.Classe;


/**
 * Servlet implementation class ClassController
 */
@WebServlet("/classes")
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	ClassDAOI clsDao=null;
	public ClassController() {
		super();
		clsDao=new ClassDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
				response.sendRedirect("login.jsp");
			} else if (request.getParameter("action").equals("display")) {
				doDisplay(request, response);
		
		} else {
			response.sendRedirect("login.jsp");
		}
		}
	}
	private void doDisplay(HttpServletRequest request, HttpServletResponse response) {
		
		String classname=request.getParameter("classname");
		Classe cls=new Classe();
		cls.setName(classname);
		boolean added= clsDao.insert(cls);
		
		if(added) {
			try {
				request.setAttribute("success", "Class Added Successfully");
				request.getRequestDispatcher("add-classes.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}

	
	