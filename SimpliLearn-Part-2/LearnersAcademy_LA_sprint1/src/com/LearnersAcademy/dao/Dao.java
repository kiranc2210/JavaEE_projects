package com.LearnersAcademy.dao;

import java.sql.ResultSet;

import com.LearnersAcademy.model.Admin;

public interface Dao {
	public int add(Admin admin);
	
	public ResultSet getAll();
	
	public int update(Admin admin);
	
	public int delete(int id);
	
	public ResultSet get(int id);
}
