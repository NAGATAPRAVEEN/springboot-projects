package com.zensar.UI;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import com.zensar.bean.Address;
import com.zensar.bean.JPAUTIL;
import com.zensar.bean.Student;

public class Main3 {
	static void insert() {
		Address address=new Address("F-3", "WilsonGarden","Hyderabad");
		
		Student student=new Student();
		student.setRollNumber(1067);
		student.setName("john");
		student.setAddress(address);
		
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		
		JPAUTIL.shutDown();
		
	}
	static void load() {
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro");
		
		Student student=em.find(Student.class, 1067);
		
		System.out.println(student);
		JPAUTIL.shutDown();
		
		
	}
	
	static void loadAll() {
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro");
		String qry="from Student";
		Query query=em.createQuery(qry);
		List<Student> allStudents=query.getResultList();
		System.out.println(allStudents);
		JPAUTIL.shutDown();
	}
	static void editing() {
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro");
		Student student=em.find(Student.class, 1067);
		student.setName(student.getName().toUpperCase());
		student.getAddress().setCityName("Hyderabad");
		
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		JPAUTIL.shutDown();
	}
	static void deleting() {
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro") ;
		Student student=em.find(Student.class, 1067);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		JPAUTIL.shutDown();
	}
	
	public static void main(String[]args) {
		deleting();
		
		
	}

}
