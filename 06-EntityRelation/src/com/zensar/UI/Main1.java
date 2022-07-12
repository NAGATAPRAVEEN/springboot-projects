package com.zensar.UI;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Contactinfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;


public class Main1 {
	
	
	
	static void test1() {
		Person person=new Person("john", LocalDate.of(1986, 12, 8),'M');
		person.setPersonId(1069);
		Contactinfo contactInfo=new Contactinfo("John@gmail.com", "9878999777");
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}
	
	static void test2 () {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Person person=em.find(Person.class,1069);
		System.out.println(person);
		JPAUtil.shutDown();
	}
	
	static void test3() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contactinfo contactInfo=em.find(Contactinfo.class,1069);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		test3();
		
	}
	

}
