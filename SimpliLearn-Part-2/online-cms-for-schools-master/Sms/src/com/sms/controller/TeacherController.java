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
import com.sms.dao.TeacherQueries;
import com.sms.jsp.utils.Functions;
import com.sms.model.LoginBean;
import com.sms.model.Student;
import com.sms.model.Teacher;

/**
 * Servlet implementation class TeacherController
 */
@WebServlet("/TeacherController")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
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
			if(action.equalsIgnoreCase("profile"))
			{
				String uri ="";
				List<Teacher> tList = new ArrayList<Teacher>();
				tList = QueryFactory.TeacherQueries().selectTeachers();
				request.setAttribute("teacherList", tList);
				uri="view-teacher.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(uri);
				rd.forward(request, response);
			}else if(action.equalsIgnoreCase("del"))
			{
				@SuppressWarnings("unused")
				String uri ="";
				int numOfrow = 0;
				String student_id = request.getParameter("student_id");
				
				numOfrow = QueryFactory.getStudentQueries().deleteQuery(student_id);
				
				if(numOfrow==1){
					response.sendRedirect("./StudentController?action=profile");
				}
			}
		}else if(request.getParameter("student_id")!=null && request.getParameter("action")!=""){
			System.out.println("here");
			String student_id = request.getParameter("student_id");
			String uri ="manage-student.jsp";
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
		int numOfRows = 0 ;
		String post ="";
		if(request.getParameter("post")!=null){
			post = request.getParameter("post");

/*
	private String firstname;
	private String lastname;
	private int gender;
	private Date dob;
	private Date doa;
	private String fieldOfStudy;
	private String address;
	private String email;
	private String phone;
	private String password;
 * */			
			
			if(post.equalsIgnoreCase("add"))
			{
				Teacher teacher  = new Teacher();
				teacher.setFirstname(request.getParameter("firstname"));
				teacher.setLastname(request.getParameter("lastname"));
				teacher.setGender(request.getParameter("gender"));
				teacher.setDob(Functions.getSqlDate(request.getParameter("dob")));
				teacher.setDoa(Functions.getSqlDate(request.getParameter("doa")));
				teacher.setAddress(request.getParameter("address"));
				teacher.setEmail(request.getParameter("email"));
				teacher.setPhone(request.getParameter("phone"));
				teacher.setFieldOfStudy(request.getParameter("education"));
				teacher.setPhone(request.getParameter("phone"));
				teacher.setTeacher_id(Functions.generate_User_ID("teacher"));
				numOfRows = TeacherQueries.insertQuery(teacher);
				LoginBean lb = new LoginBean();
				lb.setFirstname(teacher.getFirstname());
				lb.setLastname(teacher.getLastname());
				lb.setEmail(teacher.getEmail());
				lb.setPassword(request.getParameter("password"));
				lb.setUser_id(teacher.getTeacher_id());
				lb.setUsertype("teacher");
				numOfRows = QueryFactory.getCommanQueries().insertQuery(lb);
				if(numOfRows==1){
					response.sendRedirect("add-teacher.jsp?id=1");
				}
			}
		}			
	}

}
