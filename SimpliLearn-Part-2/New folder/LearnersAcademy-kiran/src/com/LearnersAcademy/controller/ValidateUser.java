package com.LearnersAcademy.controller;

public class ValidateUser {
	
	public boolean isValidUser(String userName,String userPassword) {
		
		
		if(userName.equals("Admin") && userPassword.equals("Admin")) {
			return true;
		}
		
		return false;
		
	}

}
