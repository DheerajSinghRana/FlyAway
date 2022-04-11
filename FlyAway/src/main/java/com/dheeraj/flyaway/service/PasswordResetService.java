package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.AdminUser;
import com.dheeraj.flyaway.model.Customer;

public class PasswordResetService {
	
	private SessionService sessionService = new SessionService();
	
	public String forgotPassword(String email) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		String result = null;
		try {
			Customer customer = (Customer)session.load(Customer.class, email);
		if(customer != null && customer.getEmail().equals(email)) {
			result = "Success";
			txn.commit();
		} else {
			result =  "not found";
			txn.commit();
		}
		} catch(Exception e) {
			result =  "not found";
		}
		return result;
	}
	
}

