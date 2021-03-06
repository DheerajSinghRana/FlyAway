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
import com.dheeraj.flyaway.service.AdminPasswordResetNowService2;
import com.dheeraj.flyaway.service.PasswordResetNowService;
import com.dheeraj.flyaway.service.PasswordResetService;
import com.dheeraj.flyaway.service.SearchFlightService;

/**
 * Servlet implementation class AdminPasswordResetNowServlet2
 */
@WebServlet("/adminPasswordResetNow")
public class AdminPasswordResetNowServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPasswordResetNowServlet2() {
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
		String password = request.getParameter("password");
		
		AdminPasswordResetNowService2 passwordResetNowService = new AdminPasswordResetNowService2();
		
		String result = passwordResetNowService.forgotReset(email,password);
		
		if(result.equals("Success")){
			response.sendRedirect("adminForgotPasswordSuccess.jsp");
			
		} else {
			out.println("Issue resetting password");
		}
	}

}
