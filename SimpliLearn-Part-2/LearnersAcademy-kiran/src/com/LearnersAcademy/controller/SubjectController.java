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
import com.LearnersAcademy.dao.SubjectDaoI;
import com.LearnersAcademy.dao.SubjectDaoImp;
import com.LearnersAcademy.model.ClassBean;
import com.LearnersAcademy.model.StudentBean;
import com.LearnersAcademy.model.SubjectBean;

/**
 * Servlet implementation class SubjectController
 */
@WebServlet("/Subject")
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SubjectDaoI subDao=null;
    public SubjectController() {
        super();
        subDao=new SubjectDaoImp();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		System.out.println(action);
		
			switch (action) {
	
			case "add-subject":
				showForm(request, response);
				break;
			case "register-subject":
				registrSubject(request, response);
				break;
			case "view-subject":
				viewSubject(request, response);
				break;
			case "edit":
				getSubjectById(request, response);
				break;
			case "update-subject":
				updateSubject(request, response);
				break;
			case "delete":
				deleteSubject(request, response);
				break;
			}
	}

	
	private void deleteSubject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int subject_id=Integer.parseInt(request.getParameter("id"));
		if( subDao.deleteSubject(subject_id)) {
			
			viewSubject(request, response);
		}
		else {
			 RequestDispatcher dispatcher = request.getRequestDispatcher("view-subject.jsp");
			 out.print("unable to delete the record");
		        dispatcher.include(request, response);
		}
		
	}


	private void updateSubject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("subject_id"));
		 String subname=request.getParameter("subname");
		 SubjectBean subbn= new SubjectBean();
		 subbn.setSub_name(subname);
		 
			if( subDao.updateSubject(subbn)) {
				
				viewSubject(request, response);
				
			}else {
				 RequestDispatcher dispatcher = request.getRequestDispatcher("view-subject.jsp");
				 request.setAttribute("stdid", "Failed to update details of the following student ID:"+subbn.getSub_id());
			        dispatcher.include(request, response);
			 
			}
	}


	private void getSubjectById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int studentid=Integer.parseInt(request.getParameter("id"));
		
		SubjectBean subbean=subDao.getSubject(studentid);
		
		request.setAttribute("subject", subbean);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-subject.jsp");
		   dispatcher.forward(request, response);
		
	}


	private void viewSubject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<SubjectBean> subjects=subDao.getAllSubjects();
		request.setAttribute("listsubjs", subjects);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-subject.jsp");
        dispatcher.forward(request, response);
	}


	private void registrSubject(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 String subjectname=request.getParameter("subname");
		 String classname=request.getParameter("clasname");
		 ClassBean clsb=new ClassBean();
		 clsb.setC_name(classname);
		SubjectBean sub= new SubjectBean();
		sub.setSub_name(subjectname);
		sub.setCls(clsb);
		
		 
		if( subDao.addSubject(sub)) {
			response.sendRedirect("add-subject.jsp?status=Success");
			
		}else {
		response.sendRedirect("add-subject.jsp?status=Failed");
		 
		}
		
	}


	private void showForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.sendRedirect("add-subject.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
