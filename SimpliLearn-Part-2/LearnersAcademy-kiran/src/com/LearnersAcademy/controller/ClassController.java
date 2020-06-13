package com.LearnersAcademy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LearnersAcademy.dao.ClasseDaoI;
import com.LearnersAcademy.dao.ClasseDaoImp;
import com.LearnersAcademy.dao.SubjectDaoI;
import com.LearnersAcademy.dao.SubjectDaoImp;
import com.LearnersAcademy.model.ClassBean;
import com.LearnersAcademy.model.SubjectBean;


@WebServlet("/Class")
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ClasseDaoI clDao=null;
	SubjectDaoI subDao=null;
    public ClassController() {
        super();
        clDao=new ClasseDaoImp();
    	 subDao=new SubjectDaoImp();
      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		System.out.println(action);
		
			switch (action) {
	
			case "add-class":
				showForm(request, response);
				break;
			case "register-classes":
				registrclasses(request, response);
				break;
			case "view-classes":
				viewclasses(request, response);
				break;
			case "edit":
				getClassesById(request, response);
				break;
			case "update-class":
				updateClasses(request, response);
				break;
			case "delete":
				deleteClasses(request, response);
				break;
			}
	}

	
	private void deleteClasses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int C_id=Integer.parseInt(request.getParameter("id"));
		if( clDao.deleteClasses(C_id)) {
			
			viewclasses(request, response);
		}
		else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("view-classes.jsp");
			 out.print("unable to delete the record");
		        dispatcher.include(request, response);
		}
		
	}

	private void updateClasses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("subject_id"));
		 String clnaname=request.getParameter("subname");
		 ClassBean clsbn= new ClassBean();
		 clsbn.setC_name(clnaname);
		 
			if( clDao.updateClasses(clsbn)) {
				
				viewclasses(request, response);
				
			}else {
				 RequestDispatcher dispatcher = request.getRequestDispatcher("view-subject.jsp");
				 request.setAttribute("stdid", "Failed to update details of the following student ID:"+clsbn.getC_id());
			        dispatcher.include(request, response);
			 
			}
	}

	private void getClassesById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int clsid=Integer.parseInt(request.getParameter("id"));
		
		ClassBean clsbean=clDao.getClasses(clsid);
		
		request.setAttribute("classes", clsbean);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-classes.jsp");
		   dispatcher.forward(request, response);
		
	}

	private void viewclasses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ClassBean> classes=clDao.getAllClasses();
		request.setAttribute("listclss", classes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-classes.jsp");
        dispatcher.forward(request, response);
		
	}

	private void registrclasses(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 String clsname=request.getParameter("classname");
			ClassBean cl= new ClassBean();
			cl.setC_name(clsname);
			 
			if( clDao.addClasses(cl)) {
				response.sendRedirect("add-classes.jsp?status=Success");
				
			}else {
			response.sendRedirect("add-classes.jsp?status=Failed");
			 
			}
		
	}

	private void showForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.sendRedirect("add-classes.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}



}
