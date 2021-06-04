package com.hib.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

    	SessionFactory factory = HibernateUtil.getSessionFactory(); 
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction();  
    	
    	Student sd=new Student();
    	
    	sd.setId(103);
    	sd.setName("peter");
        sd.setAddress("america");
        
        Student sd1=new Student(103,"raj","vijaywda");
        
         Integer i=(Integer) session.save(sd1);
         
         System.out.println("inserted element:"+i);
         System.out.println("saved successfully");
         
         
         Student std=session.get(Student.class, 101);
         System.out.println(std);
         
         t.commit();
         
         session.close();
         factory.close();
	}

}
