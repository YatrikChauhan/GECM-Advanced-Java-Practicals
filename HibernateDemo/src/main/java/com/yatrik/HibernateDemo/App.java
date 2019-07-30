package com.yatrik.HibernateDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
        User a1 = new User();
        a1.setUsername("Yatrik");
        a1.setRollno(101);
        Configuration cf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a1);
        tx.commit();
    }
}
