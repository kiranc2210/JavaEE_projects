package com.LearnersAcademy.dao;

import java.util.Set;

import com.LearnersAcademy.model.Classe;

public interface ClassDAOI {
	public boolean insert(Classe classe);
	public Set<Classe> display();
	public boolean update(Classe classe, int id);
	public boolean delete(int id);
	

}
