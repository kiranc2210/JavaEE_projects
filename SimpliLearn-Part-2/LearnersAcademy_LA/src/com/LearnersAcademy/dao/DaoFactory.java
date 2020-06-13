package com.LearnersAcademy.dao;



public class DaoFactory {

	public static Dao getStudentDao(){
		return new StudentDao();
	}
	

	
	
	
}
