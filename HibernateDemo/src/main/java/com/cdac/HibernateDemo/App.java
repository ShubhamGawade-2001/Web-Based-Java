
package com.cdac.HibernateDemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration hiberConfig = new Configuration();

		hiberConfig.configure("hibernate.cfg.xml");

		try (SessionFactory hbFactory = hiberConfig.buildSessionFactory();
				Session hbSession = hbFactory.openSession();) {
		//	private static void(Session hbSession) {
			System.out.println("Hello World!");
			Users uObj = new Users();
			
//			uObj.setUsername("Shubham3");
//			uObj.setPassword("Shubham3");
//			uObj.setName("ShubhamThree");
//			uObj.setEmail("Shubham3@test.com");
//			Transaction tx = hbSession.beginTransaction();
//			
//			hbSession.persist(uObj);
//			
//			tx.commit();
			
			uObj =hbSession.get(Users.class,"acts");
			System.out.println(uObj.getUsername());
			System.out.println(uObj.getEmail());
			
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}

	}
}