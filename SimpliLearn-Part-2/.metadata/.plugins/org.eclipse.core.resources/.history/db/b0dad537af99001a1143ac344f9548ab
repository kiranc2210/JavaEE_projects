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
import javax.servlet.http.HttpSession;

import com.LearnersAcademy.dao.CommanQueries;
import com.LearnersAcademy.dao.QueryFactory;

import com.LearnersAcademy.jsp.utils.Functions;
import com.LearnersAcademy.model.LoginBean;
import com.LearnersAcademy.model.Marks;
import com.LearnersAcademy.model.Notices;
import com.LearnersAcademy.model.Student;


/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userType = request.getParameter("level");
		String user_id = "", user_password = "";	
		LoginBean loginBean=null;
				
		if(!request.getParameter("userid").trim().isEmpty() && request.getParameter("userid").trim()!="" && !request.getParameter("password").trim().isEmpty() && request.getParameter("password").trim()!=""){
			user_id = request.getParameter("userid");
			user_password = request.getParameter("password");	
		
			try {
				 
				System.out.println(userType +"="+user_id+"="+user_password);
				loginBean = CommanQueries.loginQuery(user_id, user_password,userType);
				if(loginBean==null){response.sendRedirect("index.jsp?code="+userType);
				}
				System.out.println(loginBean.toString());
				
					if(loginBean.getUser_id()!=null || loginBean.getUser_id()!="" && loginBean.getUsertype()!="")
					{	
						Marks mList = new Marks();
						Student std = new Student();
						HttpSession session = request.getSession();
						session.setAttribute("User-ID", loginBean.getUser_id());
						session.setAttribute("User-Type", loginBean.getUsertype());
						String flname="";
						flname = loginBean.getFirstname()+""+loginBean.getLastname();
						session.setAttribute("User-Name", flname);
						
						String usertype ="";
						String uri = "";
						
						usertype = loginBean.getUsertype();
						System.out.println(usertype);
						if(usertype.equalsIgnoreCase("admin"))
						{
							uri = "./dashboard.jsp";
							System.out.println("usertype is "+usertype+"change URI "+uri);
							
						}else if(usertype.equalsIgnoreCase("student"))
						{
							mList = QueryFactory.getMarksQuery().selectQuery(loginBean.getUser_id());
							
							std = QueryFactory.getStudentQueries().getStudentById(loginBean.getUser_id()); 
							System.out.println(mList.toString());
							uri = "./s_dashboard.jsp";
							System.out.println("usertype is "+usertype+"change URI "+uri);
							
						}else if(usertype.equalsIgnoreCase("teacher"))
						{
							uri = "./t_dashboard.jsp";
							System.out.println("usertype is "+usertype+"change URI "+uri);
						}
						else{
							response.sendRedirect("index.jsp?code=error");	
						}
						
						request.setAttribute("mymark", mList);
						request.setAttribute("std", std);
						
						List<Student> sList = new ArrayList<Student>();
						sList = QueryFactory.getStudentQueries().selectQuery();
						request.setAttribute("studList", sList);
						
						List<Notices> nList = new ArrayList<Notices>();
						nList = QueryFactory.getNewsQuery().selectQuery();
						request.setAttribute("noteList", nList);
						
						Functions.dispatchNews(request, response);
						request.setAttribute("loginBean", loginBean);
						RequestDispatcher rd = request.getRequestDispatcher(uri);
						rd.forward(request, response);
					
					}
					else{
						if(userType!=""){
							response.sendRedirect("index.jsp?code="+userType);	
						}else{
							response.sendRedirect("index.jsp?code=error");	
						}
					
					}	

			}catch (Exception e) {		
				e.printStackTrace();
				
			}
		}else{
			if(userType!=""){
				response.sendRedirect("index.jsp?code="+userType);	
			}else{
				response.sendRedirect("index.jsp?code=error");	
			}
		}
		
		
	}
	
}
