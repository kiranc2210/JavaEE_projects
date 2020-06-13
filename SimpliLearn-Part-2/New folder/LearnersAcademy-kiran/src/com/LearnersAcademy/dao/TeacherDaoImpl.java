package com.LearnersAcademy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.LearnersAcademy.jsp.utils.HibernateUtil;
import com.LearnersAcademy.model.TeacherBean;

public class TeacherDaoImpl implements TeacherDaoI {

	@Override
	public boolean addTeacher(TeacherBean teachBean) {
		boolean added = false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(teachBean);
			// commit transaction
			added = true;
			transaction.commit();
			
		} catch (Exception e) {
//		if (transaction != null) {
//				transaction.rollback();
//			}
			e.printStackTrace();
		}
		return added;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TeacherBean> getAllTeachers() {
		Transaction transaction = null;

		List<TeacherBean> listOfTeacher = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object

			listOfTeacher = session.createQuery("from TeacherBean").list();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return listOfTeacher;
	}

	@Override
	public boolean updateTeacher(TeacherBean teachBean) {
		boolean added = false;
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(teachBean);
			added = true;
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
	public boolean deleteTeacher(int id) {
		boolean deleted = false;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			TeacherBean teacherbean = session.get(TeacherBean.class, id);
			if (teacherbean != null) {
				session.delete(teacherbean);
				deleted = true;
				System.out.println("teacherbean is deleted");
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
	public TeacherBean getTeacher(int id) {
		Transaction transaction = null;
		TeacherBean teachBean = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			teachBean = session.get(TeacherBean.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return teachBean;
	}

}
