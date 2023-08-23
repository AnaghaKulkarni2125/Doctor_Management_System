package org.bmit.doctormanagement;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainClass {
	
	public static void main(String[] args) throws IOException {
	System.out.println("Program started");
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Doctor d=new Doctor();
	d.setDocName("Dr. Bunga");
	d.setDocQualification("MBBS M.D(MS)");
	
	
	FileInputStream fis=new FileInputStream("src/main/java/doc.jpg");
	byte[] data=new byte[fis.available()];
	fis.read(data);
	d.setImage(data);
	session.save(d);
	
	Doctor d1=new Doctor();
	d1.setDocName("Dr. Bungi");
	d1.setDocQualification("MBBS M.D(Cardiologist)");
	
	FileInputStream fis1=new FileInputStream("src/main/java/doc1.jpg");
	byte[] data1=new byte[fis1.available()];
	fis.read(data1);
	d1.setImage(data1);
	session.save(d1);
	
	
	tx.commit();
	factory.close();
	session.close();
	System.out.println("Program Ended");
	}
}