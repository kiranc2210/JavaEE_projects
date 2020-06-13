package com.LearnersAcademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.LearnersAcademy.jsp.utils.HibernateUtil;
import com.LearnersAcademy.model.ClassBean;


public  class ClasseDaoImp implements ClasseDaoI {
	
	@Override
	public boolean addClasses(ClassBean clsBean) {
		boolean added=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(clsBean);
			// commit transaction
			added=true;
			transaction.commit();
			session.close();
		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
			e.printStackTrace();
		}
		return added;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ClassBean> getAllClasses() {
Transaction transaction = null;
		
		List<ClassBean> listOfCls = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfCls = session.createQuery("from ClassBean").list();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return listOfCls;
	}

	@Override
	public boolean updateClasses(ClassBean clsBean) {
		boolean added=false;
		Transaction transaction = null;
		
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        // start a transaction
        transaction = session.beginTransaction();
        // save the student object
        session.saveOrUpdate(clsBean);
        added=true;
        // commit transaction
        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
	return added;
	}

	@Override
	public boolean deleteClasses(int id) {
		boolean deleted=false;
		  Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            ClassBean classBean = session.get(ClassBean.class, id);
	            if (classBean != null) {
	                session.delete(classBean);
	                deleted=true;
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
			return deleted;
	}

	@Override
	public ClassBean getClasses(int id) {
		Transaction transaction = null;
        ClassBean clsBean = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            clsBean = session.get(ClassBean.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return clsBean;

}
}


