package com.LearnersAcademy.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LearnersAcademy.dao.QueryFactory;
import com.LearnersAcademy.model.Marks;
import com.LearnersAcademy.model.Notices;
import com.LearnersAcademy.model.Student;

/**
 * Servlet implementation class MarksController
 */
@WebServlet("/MarksController")
public class MarksController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarksController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String r_by ="";
		if(request.getParameter("by")!=null && request.getParameter("by")!="" && request.getParameter("s_id")!="" && request.getParameter("s_id")!=null){
			r_by = request.getParameter("by");
			System.out.println(r_by);
			
			List<Notices> nList = new ArrayList<Notices>();
			nList = QueryFactory.getNewsQuery().selectQuery();
			request.setAttribute("noteList", nList);
			
			String s_id = request.getParameter("s_id");
			String uri ="";
			Marks mList = new Marks();
			Student std=new Student();
			std = QueryFactory.getStudentQueries().getStudentById(s_id);
			request.setAttribute("std", std);
			mList = QueryFactory.getMarksQuery().selectQuery(s_id);
			request.setAttribute("mymark", mList);
			
			
			if(r_by.equalsIgnoreCase("student"))
			{
				uri = "./s_dashboard.jsp";	
			}else if(r_by.equalsIgnoreCase("admin"))
			{
				uri = "./view-marks.jsp";	
			}else if(r_by.equalsIgnoreCase("teacher"))
			{
				uri = "./t-add-mark.jsp";	
			}else if(r_by.equalsIgnoreCase("teacher-v"))
			{
				uri = "./t-view-mark.jsp";	
			}
			RequestDispatcher rd = request.getRequestDispatcher(uri);
			rd.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numOfRows = 0 ;
		String post ="";
		String uri = "";
		if(request.getParameter("post")!=null){
			post = request.getParameter("post");
			if(post.equalsIgnoreCase("add"))
			{
				Marks markbn = new Marks();
				markbn.setStudent_id(request.getParameter("student_id"));
				markbn.setSinhala(request.getParameter("sinahala"));
				markbn.setEnglish(request.getParameter("english"));
				markbn.setTamil(request.getParameter("tamil"));
				markbn.setMathematics(request.getParameter("math"));
				markbn.setScience(request.getParameter("science"));
				markbn.setComputer_science(request.getParameter("commerce"));
				markbn.setCommerce(request.getParameter("computer"));
				markbn.setMusic(request.getParameter("music"));
				markbn.setDancing(request.getParameter("dancing"));
				markbn.setDrawing(request.getParameter("drawing"));
				markbn.setHealth(request.getParameter("health"));
				markbn.setGeography(request.getParameter("geography"));
				markbn.setHistory(request.getParameter("history"));
				markbn.setReligion(request.getParameter("religion"));
				
				System.out.println(markbn.toString());
				
				if(markbn.getStudent_id()!=null || (!markbn.getStudent_id().isEmpty())){
					numOfRows = QueryFactory.getMarksQuery().updateQuery(markbn);
					System.out.println(numOfRows);
					if(numOfRows==1){
						uri = "t-add-mark.jsp?s_id="+markbn.getStudent_id();
						
						
						
						Marks smark = new Marks();
						smark = QueryFactory.getMarksQuery().selectQuery(markbn.getStudent_id());
						request.setAttribute("mymark", smark);
						
						String std_id = smark.getStudent_id();
						request.setAttribute("student_id", std_id);
						
						String code = "1";
						request.setAttribute("code", code);
						
						
						List<Notices> nList = new ArrayList<Notices>();
						nList = QueryFactory.getNewsQuery().selectQuery();
						request.setAttribute("noteList", nList);
						
						RequestDispatcher rd =request.getRequestDispatcher(uri);
						rd.forward(request, response);
					}
				}
				
			}	
			
		}
	}

}
