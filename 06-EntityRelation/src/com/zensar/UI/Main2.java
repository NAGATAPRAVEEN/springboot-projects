package com.zensar.UI;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.zensar.bean.pack2.Course;
import com.zensar.bean.pack2.Subject;
import com.zensar.util.JPAUtil;

public class Main2 {

	static void test1() {
		Subject subject1=new Subject("HTML",20);
		Subject subject2=new Subject("Css",10);
		Subject subject3=new Subject("Js",20);
		Subject subject4=new Subject("Angular",20);
		
		
		Set<Subject> subjects =new HashSet<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);
		
		Course course=new Course("Web Technologies", 30000.00, subjects);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
	}
	
	public static void main(String[] args) {
		test1();
		
	}
	
}
