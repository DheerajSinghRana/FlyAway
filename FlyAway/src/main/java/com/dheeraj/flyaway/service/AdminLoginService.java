package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.AdminUser;
import com.dheeraj.flyaway.model.Customer;

public class AdminLoginService {
	
	private SessionService sessionService = new SessionService();
	
	public String getAdminUser(String username, String password) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		String result = null;
		try {
			AdminUser customer = (AdminUser)session.load(AdminUser.class, username);
		if(customer.getPassword().equals(password)) {
			result = customer.getName();
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

