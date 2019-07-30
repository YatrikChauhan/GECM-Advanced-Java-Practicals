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
			
			User a1 = new User();
			a1.setFname("Yatik");
			a1.setLname("Chauhan");
			a1.setId(101);
			
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
			
			ServiceRegistry srg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
			
			SessionFactory sf = cfg.buildSessionFactory(srg);
			
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();
			ss.save(a1);
			tx.commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
