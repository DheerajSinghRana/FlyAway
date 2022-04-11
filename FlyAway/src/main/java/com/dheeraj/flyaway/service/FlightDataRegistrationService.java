package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.AdminUser;
import com.dheeraj.flyaway.model.Customer;
import com.dheeraj.flyaway.model.FlightData;

public class FlightDataRegistrationService {
	
	private SessionService sessionService = new SessionService();
	
	public String saveFlightData(FlightData flightData) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		String result = null;
		
		try {
		session.save(flightData);
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

