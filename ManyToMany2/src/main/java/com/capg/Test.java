package com.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entity.Library;
import com.capg.entity.Student;

public class Test {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student stu1 =new Student();
		stu1.setFees(700L);
		stu1.setId(30);
		stu1.setName("Sam");
		
		Student stu2 =new Student();
		stu2.setFees(700L);
		stu2.setId(40);
		stu2.setName("Harry");
		
		Library lib1 = new Library();
		lib1.setBookid(105);
		lib1.setBookname("Database");
		
		Library lib2 = new Library();
		lib2.setBookid(103);
		lib2.setBookname("Java");
		
		stu1.getLib().add(lib1);
		stu1.getLib().add(lib2);
		stu2.getLib().add(lib1);
		
		
		lib1.getStu().add(stu1);
		lib1.getStu().add(stu2);
		lib2.getStu().add(stu1);
		
		em.persist(stu1);
		em.persist(stu2);
		
		em.persist(lib1);
		em.persist(lib2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}


}
