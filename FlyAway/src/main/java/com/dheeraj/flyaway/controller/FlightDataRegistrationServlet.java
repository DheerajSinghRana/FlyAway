package com.dheeraj.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dheeraj.flyaway.model.FlightData;
import com.dheeraj.flyaway.service.AdminLoginService;
import com.dheeraj.flyaway.service.LoginService;
import com.dheeraj.flyaway.service.FlightDataRegistrationService;
import com.dheeraj.flyaway.service.UserRegistrationService;

import javax.servlet.http.Cookie;

/**
 * Servlet implementation class FlightDataRegistrationServlet
 */
@WebServlet("/flightDataRegistration")
public class FlightDataRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightDataRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String source =request.getParameter("source");
		String destination =request.getParameter("destination");
		String flightName =request.getParameter("fightName");
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("date"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Double price = Double.parseDouble(request.getParameter("price"));
		String time = request.getParameter("time");
		
		FlightData flightData = new FlightData();
		flightData.setSourceCity(source);
		flightData.setDestinationCity(destination);
		flightData.setFlightName(flightName);
		flightData.setPrice(price);
		flightData.setFlightDate(date);
		flightData.setTime(time);
		
		FlightDataRegistrationService sourceRegistrationService = new FlightDataRegistrationService();
		
		String result = sourceRegistrationService.saveFlightData(flightData);
		
		if(result.equals("fail")){
			out.println("Not Saved!");
		} else {

			HttpSession session=request.getSession();  
	        session.setAttribute("name",result);  
	        response.sendRedirect("adminDashboard.jsp?success=true");   
		 		
		}
	}

}
