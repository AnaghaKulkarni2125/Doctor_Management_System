package org.bmit.doctormanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDoctor {
	public static void main(String[] args) {
		System.out.println("Program started");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		System.out.println("--------------GET-METHOD------------");
		Doctor d=session.get(Doctor.class, 1);
		System.out.println(d);
		
		System.out.println("--------------LOAD-METHOD------------");
		Doctor d1=session.get(Doctor.class, 2);
		System.out.println(d1);
		System.out.println("Program Ended");
		
	}
}


