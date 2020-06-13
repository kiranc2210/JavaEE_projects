package com.LearnersAcademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LearnersAcademy.dao.QueryFactory;
import com.LearnersAcademy.model.Stat;

/**
 * Servlet implementation class StatController
 */
@WebServlet("/StatController")
public class StatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action ="";
		if(request.getParameter("action")!=null && request.getParameter("action")!=""){
			action = request.getParameter("action");
			System.out.println(action);
			if(action.equalsIgnoreCase("stats"))
			{
				String uri ="";
				Stat sList = new Stat();
				sList.setStuduentCount(QueryFactory.getStudentQueries().countStudent());
				sList.setTeachersCount(QueryFactory.TeacherQueries().countTeacher());
				request.setAttribute("stcount", sList);
				uri="stats.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
