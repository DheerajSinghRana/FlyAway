package com.dheeraj.flyaway.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheeraj.flyaway.model.AdminUser;
import com.dheeraj.flyaway.model.Customer;
import com.dheeraj.flyaway.model.FlightData;

public class SerchFlightByIdService {
	
	private SessionService sessionService = new SessionService();
	
	public FlightData searchFlightById(String id) {
		Session session = sessionService.getHibernateSession();
		Transaction txn = session.beginTransaction();
		FlightData flightData = null;
		try {
			int fId = Integer.parseInt(id);
			 flightData = (FlightData)session.load(FlightData.class, fId);
		if(flightData != null && flightData.getFlightId() == fId) {
			txn.commit();
			return flightData;
		} else {
			
			return null;
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
}

