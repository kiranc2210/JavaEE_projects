package com.LearnersAcademy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.LearnersAcademy.dao.TeacherDaoI;
import com.LearnersAcademy.dao.TeacherDaoImpl;

import com.LearnersAcademy.model.TeacherBean;



@WebServlet("/Teacher")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
TeacherDaoI teachDao=null;
    
    public TeacherController() {
        super();
        teachDao=new TeacherDaoImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		System.out.println(action);
		
			switch (action) {
	
			case "add-teacher":
				showForm(request, response);
				break;
			case "register-teacher":
				registrTeacher(request, response);
				break;
			case "view-teacher":
				viewTeacher(request, response);
				break;
			case "edit":
				getTeacherById(request, response);
				break;
			case "update-teacher":
				updateTeacher(request, response);
				break;
				
			case "delete":
				deleteTeacher(request, response);
				break;
			
			}
	}
	
	
	private void deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int teacher_id=Integer.parseInt(request.getParameter("id"));
		if( teachDao.deleteTeacher(teacher_id)) {
			
			viewTeacher(request, response);
		}
		else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("view-teacher.jsp");
			 out.print("unable to delete the record");
		        dispatcher.include(request, response);
		}
	}

	private void getTeacherById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int teacher_id=Integer.parseInt(request.getParameter("id"));
	
	TeacherBean teachbean=teachDao.getTeacher(teacher_id);
	
	request.setAttribute("teacher", teachbean);
	RequestDispatcher dispatcher = request.getRequestDispatcher("update-teacher.jsp");
	   dispatcher.forward(request, response);
	
}

private void updateTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("teacher_id"));
	String firstname=request.getParameter("firstname");
	 String lastname=request.getParameter("lastname");
	 String gender=request.getParameter("gender");
	 String dob=request.getParameter("dob");
	
	 String fieldOfStudy=request.getParameter("fieldOfStudy");
	 String address=request.getParameter("address");
	
	
	 
	 TeacherBean teachbean= new TeacherBean(firstname,lastname,gender,dob,fieldOfStudy,address);
	if( teachDao.updateTeacher(teachbean)) {
		
		viewTeacher(request, response);
		
	}else {
		 RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
		request.setAttribute("stdid", "Failed to update details of the following student ID:"+teachbean.getTeacher_id());
	        dispatcher.include(request, response);
	 
	}
	
}
	
	
	
	

	private void showForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.sendRedirect("add-teacher.jsp");
		
	}
	
	
	
	
	
	

private void viewTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<TeacherBean> teachers=teachDao.getAllTeachers();
		request.setAttribute("listteachers", teachers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-teacher.jsp");
        dispatcher.forward(request, response);
	}
	

	
private void registrTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
	
	 String firstname=request.getParameter("firstname");
	 String lastname=request.getParameter("lastname");
	 String gender=request.getParameter("gender");
	 String dob=request.getParameter("dob");
	
	 String fieldOfStudy=request.getParameter("fieldOfStudy");
	 String address=request.getParameter("address");
	 
	
	 
	 TeacherBean teachbean= new TeacherBean(firstname,lastname,gender,dob,fieldOfStudy,address);
	 
	if( teachDao.addTeacher(teachbean)) {
		response.sendRedirect("add-teacher.jsp?status=Success");
		
	}else {
	response.sendRedirect("add-teacher.jsp?status=Failed");
	 
	}
	 
	 
	}
	
	
	
	
	
	
	
	 
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet( request,  response);
	}
	

}
