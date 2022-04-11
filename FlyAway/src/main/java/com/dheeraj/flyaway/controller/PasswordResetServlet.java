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
import com.dheeraj.flyaway.service.PasswordResetService;
import com.dheeraj.flyaway.service.SearchFlightService;

/**
 * Servlet implementation class PasswordResetServlet
 */
@WebServlet("/passwordReset")
public class PasswordResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordResetServlet() {
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
		String email = request.getParameter("email");
		
		
		PasswordResetService passwordResetService = new PasswordResetService();
		
		String result = passwordResetService.forgotPassword(email);
		
		if(result.equals("Success")){
			response.sendRedirect("setNewPassword.jsp?id="+email);
			
		} else {
			out.println("User not found");
		}
	}

}
