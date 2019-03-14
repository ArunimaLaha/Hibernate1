package com.pack;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String arg[])
{
	Configuration cfg=new Configuration().configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=null;
	try
	{
		t=s.beginTransaction();
		Employee e1=new Employee();
		e1.setName("oeindrila");
		Regular_Employee r=new Regular_Employee();
		r.setName("arunima");
		r.setSalary(50000);
		r.setBonus(2000);
		Contract_Employee c=new Contract_Employee();
		c.setName("rishi");
		c.setPay_hour(8);
		c.setContract_duration("rfe");
		s.persist(c);
		s.persist(e1);
		s.persist(r);
		t.commit();
		System.out.println("Succesfully inserted");
	}
	catch(HibernateException e)
	{
		System.out.println(e);
	}
	finally
	{
		s.close();
	}
}
}
