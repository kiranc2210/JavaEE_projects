package com.LearnersAcademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.LearnersAcademy.jsp.utils.HibernateUtil;

import com.LearnersAcademy.model.SubjectBean;

public class SubjectDaoImp implements SubjectDaoI {

	@Override
	public boolean addSubject(SubjectBean subBean) {
		boolean added=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(subBean);
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
	public List<SubjectBean> getAllSubjects() {
Transaction transaction = null;
		
		List<SubjectBean> listOfSubject = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfSubject = session.createQuery("from SubjectBean").list();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return listOfSubject;
	}

	@Override
	public boolean updateSubject(SubjectBean subBean) {
		boolean added=false;
		Transaction transaction = null;
		
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        // start a transaction
        transaction = session.beginTransaction();
        // save the student object
        session.update(subBean);
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
	public boolean deleteSubject(int id) {
		boolean deleted=false;
		  Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            SubjectBean subjectbean = session.get(SubjectBean.class, id);
	            if (subjectbean != null) {
	                session.delete(subjectbean);
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
	public SubjectBean getSubject(int id) {
		Transaction transaction = null;
		SubjectBean subbean = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            subbean = session.get(SubjectBean.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return subbean;
	}

}
