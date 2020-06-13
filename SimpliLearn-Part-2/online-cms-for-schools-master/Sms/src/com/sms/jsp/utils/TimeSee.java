package com.sms.jsp.utils;

import java.util.Calendar;

public class TimeSee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR); 
		int moth = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE); 
		System.out.println(year+"-"+moth+"-"+date);
		System.out.println(moth);
		System.out.println(date);
	}

}
