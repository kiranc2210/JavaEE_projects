package com.userLogin;

public class ValidateUser {
	
	public boolean isValidUser(String userName,String userPassword) {
		
		
		if(userName.equals("GreenArrow") && userPassword.equals("Oliver007")) {
			return true;
		}
		
		return false;
		
	}

}
