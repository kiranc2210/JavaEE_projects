package com.LearnersAcademy.dao;



public class DaoFactory {

	public static Dao getStudentDao(){
		return new StudentDao();
	}
	
	public static Dao getAdmindao(){
		return new AdminDao();
	}
	public static Dao getCommanDao() {
		return new CommanDao();
	}
	
	
}
