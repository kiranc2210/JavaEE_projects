package com.LearnersAcademy.dao;

public class QueryFactory {
	public static StudentQueries getStudentQueries(){
		return new StudentQueries();
	}
	
	
	
	public static TeacherQueries TeacherQueries(){
		return new TeacherQueries();
	}

	public static CommanQueries getCommanQueries() {
		return new CommanQueries();
	}

}

	public static MarksQueries getMarksQuery() {
		return new MarksQueries();
	}
	
}

