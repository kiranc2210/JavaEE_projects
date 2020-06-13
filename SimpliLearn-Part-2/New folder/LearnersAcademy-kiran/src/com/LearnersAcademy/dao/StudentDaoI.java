package com.LearnersAcademy.dao;

import java.util.List;


import com.LearnersAcademy.model.StudentBean;

public interface StudentDaoI {
public boolean addStudent(StudentBean stdBean);
	
	public List<StudentBean> getAllStudents();
	
	public boolean updateStudent(StudentBean stdBean);
	
	public boolean deleteStudent(int id);
	
	public StudentBean getStudent(int id);

}
