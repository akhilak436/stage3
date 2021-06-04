package com.hiber.examples;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory(); 
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction(); 
    	
//    	Student st=new Student(101,"rohan",50);
//    	Integer i=(Integer) session.save(st);
//    	  System.out.println(i);
//    	  
//    	Student st1=new Student(102,"peter",100);
//    	Integer i=(Integer) session.save(st1);
//     	  System.out.println(i);
//    	
    	  
    	  
    	  
    	
          //for updating the student details
//          Query q1=session.createQuery("update Student set name=:n where id=:i");
//          q1.setParameter("n", "hari");
//          q1.setParameter("i", 101);
//          int status=q1.executeUpdate();
//          System.out.println(status);
//          System.out.println("updated success fully");
          
        //delete query for student entity
         Query q2=session.createQuery("delete from Student where id=102");
          q2.executeUpdate();
         
         System.out.println("deleted success fully");
                  
        //fetching all the student
    	  Query q=session.createQuery("from Student");
          List<Student>list2=q.getResultList();
          System.out.println(list2);
          
          //min,max,avg,count
          //count
          Query q3=session.createQuery("select count(id) from Student");
          List<Integer>list=q3.getResultList();
          System.out.println(list);
          
          //max
          Query q4=session.createQuery("select sum(marks) from Student");
          List<Integer>list1=q4.getResultList();
          System.out.println(list1);
          
          
          
          
    	
    	 t.commit();  
    	factory.close();  
        session.close();  

	}

}
