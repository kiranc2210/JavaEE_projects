package com.LearnersAcademy.dao;

import java.util.List;


import com.LearnersAcademy.model.SubjectBean;

public interface SubjectDaoI {
public boolean addSubject(SubjectBean subBean);
	
	public List<SubjectBean> getAllSubjects();
	
	public boolean updateSubject(SubjectBean subBean);
	
	public boolean deleteSubject(int id);
	
	public SubjectBean getSubject(int id);

}
