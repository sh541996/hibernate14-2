package com.vp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InherMain {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee("shren","ln2",new Date(),"hr1");
		session.save(employee);
		
		transaction.commit();
		session.close();
		System.out.println("done...");
	}
}