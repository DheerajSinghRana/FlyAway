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

/**
 * Servlet implementation class SearchFlightServlet
 */
@WebServlet("/searchFlight")
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFlightServlet() {
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
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String flightDate = request.getParameter("flightDate");
		
		SearchFlightService searchFlightService = new SearchFlightService();
		
		List<FlightData> flightDataList = searchFlightService.searchFlight(source,destination,flightDate);
		
		if(flightDataList.isEmpty()){
			out.println("Data not found!!!!");
		} else {
			request.setAttribute("flightDatas", flightDataList); 
			request.getRequestDispatcher("flightList.jsp").forward(request, response);
		}
	}

}
