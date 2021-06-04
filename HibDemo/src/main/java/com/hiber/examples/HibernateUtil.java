package com.hiber.examples;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	static SessionFactory factory;
	
	static {
		
		StandardServiceRegistry srr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		MetadataSources meta=new MetadataSources(srr);
		Metadata md= meta.buildMetadata();
		factory=md.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		return factory;
	}
}
