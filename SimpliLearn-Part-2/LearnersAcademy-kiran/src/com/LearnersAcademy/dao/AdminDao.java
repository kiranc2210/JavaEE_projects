package com.LearnersAcademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.LearnersAcademy.jsp.utils.HibernateUtil;
import com.LearnersAcademy.model.AdminBean;

public class AdminDao implements AdminDaoI {

	
	
	@SuppressWarnings("unchecked")
	public List<AdminBean> getAllAdmin() {

		Transaction transaction = null;
		List<AdminBean> listOfAdmin = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfAdmin = session.createQuery("from AdminBean").list();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		//System.out.println(listOfAdmin.get(1).toString());
		return listOfAdmin;
	}


	@Override
	public boolean addAdmin(AdminBean adminBean) {
		boolean added=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(adminBean);
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
	public boolean updateAdmin(AdminBean adminBean) {
		boolean flag=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(adminBean);
			flag=true;
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return flag;
	}


	@Override
	public int deleteAdmin(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			AdminBean adm = session.get(AdminBean.class, id);
			if (adm != null) {
				session.delete(adm);
				System.out.println("user is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return 1;
	}


	@Override
	public AdminBean getAdmin(int id) {
		Transaction transaction = null;
		AdminBean adminBean = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			adminBean = session.get(AdminBean.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return adminBean;
	}
	
	public AdminBean getAdminByemain(AdminBean adminBean) {
		
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			adminBean = (AdminBean) session.createQuery("from AdminBean");
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
			e.printStackTrace();
		}
		return adminBean;
	}


	
	
}
