package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.Customer;

public class LoginService {
	
	private SessionService sessionService = new SessionService();
	
	public String getUser(String username, String password) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		String result = null;
		try {
		Customer customer = (Customer)session.load(Customer.class, username);
		if(customer.getPassword().equals(password)) {
			result = customer.getCustomerName();
			txn.commit();
		} else {
			result =  "user not found";
			txn.commit();
		}
		} catch(Exception e) {
			result =  "user not found";
		}
		return result;
	}
	
}

