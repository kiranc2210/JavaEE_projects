package com.LearnersAcademy.dao;

import java.util.List;

import com.LearnersAcademy.model.TeacherBean;

public interface TeacherDaoI {
	public boolean addTeacher(TeacherBean stdBean);

	public List<TeacherBean> getAllTeachers();

	public boolean updateTeacher(TeacherBean stdBean);

	public boolean deleteTeacher(int id);

	public TeacherBean getTeacher(int id);

}
