package com.LearnersAcademy.dao;


import java.util.List;

import com.LearnersAcademy.model.AdminBean;

public interface AdminDaoI {
	public boolean addAdmin(AdminBean adminBean);
	
	public List<AdminBean> getAllAdmin();
	
	public boolean updateAdmin(AdminBean adminBean);
	
	public int deleteAdmin(int id);
	
	public AdminBean getAdmin(int id);
}
