package com.sms.jsp.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.dao.CommanQueries;
import com.sms.dao.QueryFactory;
import com.sms.model.LoginBean;
import com.sms.model.Notices;

public class Functions {

	public static String makeItUpper(String input){
		return input.toUpperCase();
	}
	public static String getGrade(String in){
		String grade ="";
		double input = Double.parseDouble(in);
		if(input<=100){
			if(input==0 || input<=30){
				grade="F";
			}else if(input>30 && input <= 45){
				grade="D";
			}else if(input>45 && input<=65){
				grade="C";
			}else if(input>65 && input<75){
				grade="B";
			}else if(input>75 && input<=85){
				grade="A";
			}else if(input>85){
				grade="A+";
			}
		}
		return grade;
	}
	/**
	 * Login Error Message Creator
	 * code imply user type. 
	 * @param code
	 * @return message String
	 */
	public static String loginError(String code){
		String message =null;
		if(code.equals("student")){
			return message = "Hello Student, Enter Your Valid User ID and Password and try again..";
		}else if(code.equals("admin")){
			return message = "Hello Administrator, Enter Your Valid User ID and Password and try again..";
		}else if(code.equals("teacher")){
			return message = "Hello Teacher, Enter Your Valid User ID and Password and try again..";
		}else if(!code.equals("error")){
			return message = "Hello Alien, That's is bad request";
		}else{
			return message;
		}
	}	
	
    public static java.sql.Date getSqlDate(String dateString){
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dob;
		try{
		dob = formatter.parse(dateString);
		return new java.sql.Date(dob.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
    	return null;
    }
    
	public static void issetSession(){
		
	}
	
    public static String generate_User_ID(String usertype){
    	int dbIndex = 0;
    	dbIndex = CommanQueries.get_Last_User_AutoId();
	    int index=++dbIndex;
	    int year = Calendar.getInstance().get(Calendar.YEAR);
	    //int year = 17;
	    String preText =null;
	    
	    @SuppressWarnings("unused")
		String autoGenId=null;
	    if(usertype.equals("student")){
		    	preText = "sms/std/"; 
		    }else if(usertype.equals("teacher")){
		    	preText = "sms/tch/"; 	
		    }
		
		if(index<10){
			String lowindex = "0"+index;
			return autoGenId= new StringBuffer().append(preText).append(year).append("/").append(lowindex).toString();
	    }else{
	        return autoGenId= new StringBuffer().append(preText).append(year).append("/").append(index).toString();
		}
	    //return autoGenId;
    }

    
    public static String showName(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession ses = request.getSession();
		LoginBean  uBean  = new LoginBean();
		String fullname ="";
		
		@SuppressWarnings("unused")
		String userid= "";
		if(request.getSession().getAttribute("User-ID")!=null){
		String u_id = ses.getAttribute("User-ID").toString();
		uBean = QueryFactory.getCommanQueries().selectQuery(u_id);
		String fname = uBean.getFirstname();
		String lname = uBean.getLastname();
		fullname = fname+" "+lname;
		userid = u_id;
		}
		return fullname;
	}
    
    public static String showID(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession ses = request.getSession();
		String userid= "";
		if(request.getSession().getAttribute("User-ID")!=null){
		String u_id = ses.getAttribute("User-ID").toString();
		userid = u_id;
		}
		return userid;
	}    
    
    /**
     * GET today
     * @return
     */
	public static String getToday(){
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		String today="";
		int year = now.get(Calendar.YEAR); 
		int moth = now.get(Calendar.MONTH)+1;
		int date = now.get(Calendar.DATE);
		today = year+"-"+moth+"-"+date;
		return today;
	}
	
	/**
	 * NOTICES DISPATCHES
	 * @param request
	 * @param response
	 */
	public static void dispatchNews(HttpServletRequest request, HttpServletResponse response){
		List<Notices> nList = new ArrayList<Notices>();
		nList = QueryFactory.getNewsQuery().selectQuery();
		request.setAttribute("noteList", nList);
	}
}
