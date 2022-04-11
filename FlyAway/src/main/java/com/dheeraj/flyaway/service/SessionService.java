package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionService {
	private SessionFactory sessionFactory;
	
	public Session getHibernateSession() {
	
		Configuration configuration=new Configuration();

		sessionFactory=configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory.openSession();
		//Transaction transaction=  session.beginTransaction();
		//inserting employee object
		//session.save(employee);
		//Object  obj=    session.load(Customer.class,104);
		//Customer emp=(Customer)obj;
		//emp.setSalary(2300000);
		//getEmployee(104);
		//getEmployees();
		//transaction.commit();
		//System.out.println("end of main");
	}
	/*
	 * static public void deleteEmployee(Integer id) { Session
	 * session=sessionFactory.openSession(); Transaction transaction=
	 * session.beginTransaction(); Customer emp=(Customer)
	 * session.load(Customer.class,id); session.delete(emp);
	 * System.out.println("Employee Deleted"); transaction.commit();
	 * 
	 * } static public void getEmployee(Integer id) { Session
	 * session=sessionFactory.openSession(); Transaction transaction=
	 * session.beginTransaction(); Customer emp=(Customer)
	 * session.load(Customer.class,id); System.out.println(emp);
	 * System.out.println("Employee ..."); transaction.commit();
	 * 
	 * }
	 * 
	 * static public void getEmployees() { Session
	 * session=sessionFactory.openSession(); Transaction transaction=
	 * session.beginTransaction(); List<Customer> list=
	 * session.createQuery("from Employee").list(); for (Customer emp : list) {
	 * System.out.println(emp); } transaction.commit();
	 * 
	 * }
	 */

}

