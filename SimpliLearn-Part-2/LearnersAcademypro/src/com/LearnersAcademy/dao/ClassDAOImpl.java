package com.LearnersAcademy.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.LearnersAcademy.model.Classe;
import com.LearnersAcademy.utils.HibernateUtil;

public class ClassDAOImpl implements ClassDAOI{

	@Override
	public boolean insert(Classe classe) {
		boolean added=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(classe);
			// commit transaction
			added=true;
			transaction.commit();
	
		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
			e.printStackTrace();
		}
		return added;
	}

	@Override
	public Set<Classe> display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Classe classe, int id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return true;
	}

}
