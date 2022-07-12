package com.zensar.UI;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Employee;
import com.zensar.bean.JPAUTIL;

public class Main2 {
	static void insert() {
		EntityManager em=JPAUTIL.createEntityManager("JPAIntro");
		
		Employee employee=new Employee();
		employee.setName("naveen");
		employee.setBasic(69000.00);
		employee.setGrade('A');
		employee.setDateOfJoin(LocalDate.of(2022, 6, 19));
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUTIL.shutDown();
	}
	
	static void load() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		
		Employee emp=em.find(Employee.class, 1);
		System.out.println(emp);
		JPAUTIL.shutDown();
		
	}
	static void editing() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		Employee employee=em.find(Employee.class ,1);
		employee.setBasic(98000.00);
		employee.setGrade('b');
		employee.setName("guru");

		
		
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		
		JPAUTIL.shutDown();
		
	}
	
	static void deleting() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em=emf.createEntityManager();
		
		
		Employee employee=em.find(Employee.class , 1);
		
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		
		JPAUTIL.shutDown();
		
		
		
	}
	public static void main(String[]args) {
		deleting();
	}

}
