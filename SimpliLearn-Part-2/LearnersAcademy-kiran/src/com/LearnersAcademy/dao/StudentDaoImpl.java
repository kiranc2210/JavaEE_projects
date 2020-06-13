package com.LearnersAcademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.LearnersAcademy.jsp.utils.HibernateUtil;

import com.LearnersAcademy.model.StudentBean;

public class StudentDaoImpl implements StudentDaoI{

	@Override
	public boolean addStudent(StudentBean stdBean) {
		boolean added=false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(stdBean);
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
	public List<StudentBean> getAllStudents() {
		Transaction transaction = null;
		
		List<StudentBean> listOfStudent = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfStudent = session.createQuery("from StudentBean").list();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		return listOfStudent;
	}

	@Override
	public boolean updateStudent(StudentBean stdBean) {
		boolean added=false;
		Transaction transaction = null;
		
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        // start a transaction
        transaction = session.beginTransaction();
        // save the student object
        session.saveOrUpdate(stdBean);
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
	public boolean deleteStudent(int id) {
		boolean deleted=false;
		  Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            StudentBean studentbean = session.get(StudentBean.class, id);
	            if (studentbean != null) {
	                session.delete(studentbean);
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
	public StudentBean getStudent(int id) {
		Transaction transaction = null;
        StudentBean stdBean = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            stdBean = session.get(StudentBean.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return stdBean;
	}

}
