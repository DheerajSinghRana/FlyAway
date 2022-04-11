package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.AdminUser;
import com.dheeraj.flyaway.model.Customer;

public class AdminPasswordResetService2 {
	
	private SessionService sessionService = new SessionService();
	
	public String forgotPassword(String email) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		String result = null;
		try {
			AdminUser customer = (AdminUser)session.load(AdminUser.class, email);
		if(customer != null && customer.getId().equals(email)) {
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
