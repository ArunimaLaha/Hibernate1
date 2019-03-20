package com.pack;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
		try{
			t=s.beginTransaction();
			Employee e1=new Employee();
			e1.setName("aru");
			Address a=new Address();
			a.setAddress("Kolkata");
			a.setCountry("India");
			e1.setAddress(a);
			s.save(e1);
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
