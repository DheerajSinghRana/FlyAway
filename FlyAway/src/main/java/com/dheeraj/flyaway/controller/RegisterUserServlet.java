package com.dheeraj.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dheeraj.flyaway.model.Customer;
import com.dheeraj.flyaway.service.LoginService;
import com.dheeraj.flyaway.service.UserRegistrationService;

import javax.servlet.http.Cookie;

/**
 * Servlet implementation class DashboardCookieServlet
 */
@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUserServlet() {
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
		String name =request.getParameter("name");
		String phone =request.getParameter("phone");
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		UserRegistrationService userRegistrationService = new UserRegistrationService();
		
		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setEmail(email);
		customer.setPhone(phone);
		customer.setPassword(password);
		
		String result = userRegistrationService.registerUser(customer);
		
		
		if(result.equals("fail")){
			out.println("user not found!!!!");
		} else {
		
		 HttpSession session=request.getSession();  
         session.setAttribute("name",name);  
		 response.sendRedirect("dashboard.jsp");   
		 		
		}
	}

}
