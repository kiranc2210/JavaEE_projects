package com.LearnersAcademy.jsp.utils;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration().addAnnotatedClass(com.LearnersAcademy.model.Admin.class).addAnnotatedClass(com.LearnersAcademy.model.Student.class).addAnnotatedClass(com.LearnersAcademy.model.Teacher.class).configure();
				
		
				StandardServiceRegistry builder = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory=configuration.buildSessionFactory(builder);
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
