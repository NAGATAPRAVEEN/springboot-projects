package com.zensar.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Person;

public class Main1 {
	static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Person person=new Person();
		person.setName("praveen");
		person.setSalary(85000.00);
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
	}
	
		static void load() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Person person=em.find(Person.class , 1);
		System.out.println(person);
		
		em.close();
		emf.close();
		}
		
		static void editing() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Person person=em.find(Person. class, 1);
		person.setSalary(79000.00);
		
		
		em.getTransaction().begin();
		em.merge(person);
		em.getTransaction().commit();
		em.close();
		emf.close();
		}
		
		static void deleting() {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
			EntityManager em=emf.createEntityManager();
			
			Person person=em.find(Person. class,1);
			
			em.getTransaction().begin();
			em.remove(person);
			em.getTransaction().commit();
			
			em.close();
			emf.close();
			
		}
	
	public static void main(String[]args) {
		deleting();
	}

}
