package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.Customer;

public class UserRegistrationService {
	
	private SessionService sessionService = new SessionService();
	
	public String registerUser(Customer ctr) {
		String result = null;
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		try {
		session.save(ctr);
		txn.commit();
		result = "Saved";
		} catch (Exception e) {
			e.printStackTrace();
			result = "fail";
			txn.rollback();
		}
		return result;
	}
	
	
	
}

