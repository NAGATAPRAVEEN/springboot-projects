package com.zensar.UI;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.Transaction;

import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main1 {
	
	static void insert() {
        Person person=new Person();
        person.setName("veeresh");
        person.setSalary(90000.00);

        Session session=null;
        HibernateUtil.init();
        session=HibernateUtil.getSession();

        Transaction tx=session.beginTransaction();

        session.save(person);

        tx.commit();

        HibernateUtil.cleanUp();


    }
	static void load() {
		Person person =null;
		
		Session session=null;
		HibernateUtil.init();
		session=HibernateUtil.getSession();
		
		person=session.load(Person.class,2);
		System.out.println(person);
		
		HibernateUtil.cleanUp();
	}
	
	static void loadAll() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		String qry="from Person";
		Query query=session.createQuery(qry);
		List<Person> allperson = query.list();
		System.out.println(allperson);
		
		
		HibernateUtil.cleanUp();
		
	}
	
	static void editing() {
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		
		Person person=session.load(Person. class, 2);
		
		person.setSalary(670000);
		
		Transaction tx=session.beginTransaction();
		session.update(person);
		tx.commit();
		HibernateUtil.cleanUp();
	}
	
	static void deleting() {
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Person person=session.load(Person. class, 2);
		
		
		Transaction tx=session.beginTransaction();
		session.delete(person);
		tx.commit();
		HibernateUtil.cleanUp();
	}
 
    
 
    public static void main(String[] args) {
    	deleting();
        
        
		
	}
    
}

    


