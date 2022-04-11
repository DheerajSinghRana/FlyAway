package com.dheeraj.flyaway.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.dheeraj.flyaway.model.FlightData;

public class SearchFlightService {
	
	private SessionService sessionService = new SessionService();
	
	public List<FlightData> searchFlight(String source, String destination, String flightDate) {
		
		Session session = sessionService.getHibernateSession();
		Query query=session.createQuery("from FlightData where sourceCity =:sourceCity AND destinationCity = :destCity AND flightDate = :fDate");//here persistent class name is Emp  
		query.setParameter("sourceCity",source);  
		query.setParameter("destCity",destination);  
		try {
			query.setParameter("fDate",new SimpleDateFormat("dd/MM/yyyy").parse(flightDate));
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<FlightData> list=query.list(); 
		return list;
	}
	
	
	
}

