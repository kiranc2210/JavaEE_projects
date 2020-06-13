package com.LearnersAcademy.dao;

import java.util.List;

import com.LearnersAcademy.model.ClassBean;



public interface ClasseDaoI {
	public boolean addClasses(ClassBean clsBean);
public List<ClassBean> getAllClasses();
	
	public boolean updateClasses(ClassBean clsBean);
	
	public boolean deleteClasses(int id);
	
	public ClassBean getClasses(int id);

}
