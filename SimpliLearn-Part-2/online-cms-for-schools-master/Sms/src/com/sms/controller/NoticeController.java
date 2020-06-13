package com.sms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dao.QueryFactory;
import com.sms.jsp.utils.Functions;
import com.sms.model.Notices;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeController() {
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
			if(action.equalsIgnoreCase("notice"))
			{
				String uri ="";
				List<Notices> nList = new ArrayList<Notices>();
				nList = QueryFactory.getNewsQuery().selectQuery();
				request.setAttribute("noteList", nList);
				uri="notice.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
			}
		}
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numOfRows = 0 ;
		String post ="";
		
		if(request.getParameter("post")!=null){
			post = request.getParameter("post");
			if(post.equalsIgnoreCase("add"))
			{
				Notices note = new Notices();
				note.setNote_topic(request.getParameter("topic"));
				note.setNote_body(request.getParameter("notice"));
				note.setDateOfExpire(Functions.getSqlDate(request.getParameter("exp_date")));
				numOfRows = QueryFactory.getNewsQuery().inertQuery(note);
				if(numOfRows==1){
				//System.out.println(numOfRows);
				response.sendRedirect("./NoticeController?action=notice");
				}
			}
		}
		
		
	}

}
