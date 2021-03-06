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

import com.LearnersAcademy.dao.StudentDaoI;
import com.LearnersAcademy.dao.StudentDaoImpl;
import com.LearnersAcademy.model.StudentBean;



@WebServlet("/Student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDaoI stdDao=null;
    
    public StudentController() {
        super();
        stdDao=new StudentDaoImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		System.out.println(action);
		
			switch (action) {
	
			case "add-student":
				showForm(request, response);
				break;
			case "register-Student":
				registrStudent(request, response);
				break;
			case "view-student":
				viewStudent(request, response);
				break;
			case "edit":
				getstudentById(request, response);
				break;
			case "update-student":
				updateStudent(request, response);
				break;
			case "delete":
				deletestudent(request, response);
				break;
			}
	}

	private void deletestudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int student_id=Integer.parseInt(request.getParameter("id"));
		if( stdDao.deleteStudent(student_id)) {
			
			viewStudent(request, response);
		}
		else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
			 out.print("unable to delete the record");
		        dispatcher.include(request, response);
		}
	}

	private void getstudentById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentid=Integer.parseInt(request.getParameter("id"));
		
		StudentBean stdbean=stdDao.getStudent(studentid);
		
		request.setAttribute("Student", stdbean);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-student.jsp");
		   dispatcher.forward(request, response);
		
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("student_id"));
		 String firstname=request.getParameter("firstname");
		 String lastname=request.getParameter("lastname");
		 String Gender=request.getParameter("gender");
		 String dob=request.getParameter("dob");
		
		 String address=request.getParameter("address");
		
		
		 System.out.println(id);
		 StudentBean stdbn= new StudentBean(firstname,lastname,Gender,dob,address);
		 
		if( stdDao.updateStudent(stdbn)) {
			
			viewStudent(request, response);
			
		}else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
			 request.setAttribute("stdid", "Failed to update details of the following student ID:"+stdbn.getStudent_id());
		        dispatcher.include(request, response);
		 
		}
		
	}

	private void showForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.sendRedirect("add-Student3.jsp");
		
	}

	private void viewStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//StudentBean sbean=null;
		List<StudentBean> Students=stdDao.getAllStudents();
		request.setAttribute("liststds", Students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-student.jsp");
        dispatcher.forward(request, response);
	}
	private void registrStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	//PrintWriter out=response.getWriter();
		
	 String firstname=request.getParameter("firstname");
	 String lastname=request.getParameter("lastname");
	 String Gender=request.getParameter("Gender");
	 String dob=request.getParameter("dob");
	;
	 String address=request.getParameter("address");
	
	 
	 StudentBean stdbn= new StudentBean(firstname,lastname,Gender,dob,address);
	 
	if( stdDao.addStudent(stdbn)) {
		response.sendRedirect("add-student2.jsp?status=Success");
		
	}else {
	response.sendRedirect("add-student2.jsp?status=Failed");
	 
	}
	 
	 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet( request,  response);
	}
	

}
