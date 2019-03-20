package com.pack;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
		try{
			t=s.beginTransaction();
			Student s1=new Student();
			s1.setStudentId(100);
			s1.setStudentName("arunima");
			s1.setGroup("A");
			Address a=new Address();
			a.setAddressId(100);
			a.setPlace("Gariahat");
			a.setStudent(s1);
			s.save(a);
			t.commit();
			System.out.println("Success");
	}catch(HibernateException e)
	{
		System.out.println(e);
	}
	finally{
		s.close();
	}
		
	}
	

}
