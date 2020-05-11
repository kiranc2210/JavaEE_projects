package com.userLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/Relogin")
public class LogOutServltes extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LogOutServltes() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		
		
		session.invalidate();
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Login1.html");
		dispatcher.forward(request, response);
	}

}
