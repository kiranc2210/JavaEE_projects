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
import com.sms.model.LoginBean;
import com.sms.model.Marks;
import com.sms.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action ="",r_by="";
		if(request.getParameter("action")!=null && request.getParameter("action")!=""){
			action = request.getParameter("action");
			r_by = request.getParameter("by");
			System.out.println(action);
			if(action.equalsIgnoreCase("profile"))
			{
				String uri ="";
				List<Student> sList = new ArrayList<Student>();
				sList = QueryFactory.getStudentQueries().selectQuery();
				
				request.setAttribute("studList", sList);
				
				if(r_by.equalsIgnoreCase("student")){
					uri="s-view-student.jsp";
				}else if(r_by.equalsIgnoreCase("teacher")){
					uri="t-view-student.jsp";
				}else if(r_by.equalsIgnoreCase("admin")){
					uri="view-student.jsp";
				}
				
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
				
			}else if(action.equalsIgnoreCase("del"))
			{
				//String uri ="";
				int numOfrow = 0;
				String student_id = request.getParameter("student_id");
				
				numOfrow = QueryFactory.getStudentQueries().deleteQuery(student_id);
				
				if(numOfrow==1){
					response.sendRedirect("./StudentController?action=profile");
				}
			}
		}else if(request.getParameter("student_id")!=null && request.getParameter("by")!=""){
			System.out.println("here");
			String student_id = request.getParameter("student_id");
			//String uri ="manage-student.jsp";
			String uri="";
			r_by = request.getParameter("by");			
			if(r_by.equalsIgnoreCase("student")){
				uri="s-view-student.jsp";
			}else if(r_by.equalsIgnoreCase("teacher")){
				uri="t-view-student.jsp";
			}else if(r_by.equalsIgnoreCase("admin")){
				uri ="manage-student.jsp";
			}			
			System.out.println(uri);
			Student st = new Student();
			st  = QueryFactory.getStudentQueries().getStudentById(student_id);
			request.setAttribute("student", st);
			RequestDispatcher rd = request.getRequestDispatcher(uri);
			rd.forward(request, response);
		}	
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unused")
		int numOfRows = 0 ;
		String post ="";
		
		if(request.getParameter("post")!=null){
			post = request.getParameter("post");
			if(post.equalsIgnoreCase("add"))
			{
				Student student  = new Student();
				student.setFirstname(request.getParameter("firstname"));
				student.setLastname(request.getParameter("lastname"));
				student.setGender(request.getParameter("gender"));
				student.setDateOfBirth(Functions.getSqlDate(request.getParameter("dob")));
				student.setDateOfAdmission(Functions.getSqlDate(request.getParameter("doa")));
				student.setAddress(request.getParameter("address"));
				student.setEmial(request.getParameter("email"));
				student.setPhone(request.getParameter("phone"));
				student.setGuardian(request.getParameter("guardian"));
				student.setGrade(Integer.parseInt(request.getParameter("grade")));
				student.setStudent_id(Functions.generate_User_ID("student"));
				student.setUser_id(Functions.generate_User_ID("student"));
				student.setUsertype("student");
				
				LoginBean lb = new LoginBean();
				lb.setFirstname(student.getFirstname());
				lb.setLastname(student.getLastname());
				lb.setEmail(student.getEmial());
				lb.setPassword(request.getParameter("password"));
				lb.setUser_id(student.getStudent_id());
				lb.setUsertype("student");
				
				Marks initMark = new Marks();
				initMark.setStudent_id(student.getUser_id());
				
				System.out.println(student.toString());
				numOfRows = QueryFactory.getCommanQueries().insertQuery(lb);
				
				System.out.println(lb.toString());
				numOfRows = QueryFactory.getStudentQueries().insertQuery(student);
				
				System.out.println(initMark.toString());
				numOfRows = QueryFactory.getMarksQuery().insertQuery(initMark);
				
				//System.out.println(numOfRows);
				response.sendRedirect("add-student.jsp?id=1");
			}else if(post.equalsIgnoreCase("upd")){
				Student student  = new Student();
				student.setStudent_id(request.getParameter("student_id"));
				student.setFirstname(request.getParameter("firstname"));
				student.setLastname(request.getParameter("lastname"));
				student.setGender(request.getParameter("gender"));
				student.setDateOfBirth(Functions.getSqlDate(request.getParameter("dob")));
				student.setAddress(request.getParameter("address"));
				student.setEmial(request.getParameter("email"));
				student.setPhone(request.getParameter("phone"));
				student.setGuardian(request.getParameter("guardian"));
				student.setGrade(Integer.parseInt(request.getParameter("grade")));
				System.out.println(student.toString());
				int numOfRow =0 ;
				numOfRow  =QueryFactory.getStudentQueries().updateQuery(student);
				if(numOfRow==1){
				response.sendRedirect("./StudentController?action=profile");
				}
			}
		}	
	}

}
