package com.dheeraj.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dheeraj.flyaway.model.FlightData;
import com.dheeraj.flyaway.service.SearchFlightService;
import com.dheeraj.flyaway.service.SerchFlightByIdService;

/**
 * Servlet implementation class DashboardCookieServlet
 */
@WebServlet("/flightBookingInfo")
public class FlightBookingInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightBookingInfoServlet() {
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
		String persons = request.getParameter("personNo");
		String flightDataId = request.getParameter("fId");
		
		SerchFlightByIdService searchFlightService = new SerchFlightByIdService();
		
		FlightData fData = searchFlightService.searchFlightById(flightDataId);
		if(fData == null){
			out.println("Data not found!!!!");
		} else {
			request.setAttribute("flightData", fData); 
			request.setAttribute("noOfPersons", persons); 
			request.getRequestDispatcher("flightBookingReview.jsp").forward(request, response);
		}
	}

}
