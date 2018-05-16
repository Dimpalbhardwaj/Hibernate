package com.optipace.hibernateexample.util;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.optipace.hibernateexample.dto.EmployeeEntity;

public class Tester {
	public static void main(String[] args) {
		  Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        SessionFactory factory = configuration.buildSessionFactory();
	        Session session = factory.openSession();
	        Transaction trn = session.beginTransaction();
	        EmployeeEntity entity=new EmployeeEntity();
	        entity.setFirstName("Dimpal");
	        entity.setLastName("Bhardwaj");
	        entity.setEmail("dimpsbhardwaj00@gmail.com");
	        session.save(entity);
	        System.out.println("Employee saved : " + entity);
	        trn.commit();
	        session.close();
	        factory.close();
	}

}
