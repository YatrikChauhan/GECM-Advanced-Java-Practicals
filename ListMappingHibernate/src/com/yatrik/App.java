package com.yatrik;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		try {
		Laptop l1 = new Laptop();
		l1.setLid(1);
		l1.setLname("Samsung");
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setName("Yatrik");
		s1.getLaptop().add(l1);
		l1.getStud().add(s1);
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(reg);
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(s1);
		ss.save(l1);
		tx.commit();
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
		}
	}
}
