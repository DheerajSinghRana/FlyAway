package com.dheeraj.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dheeraj.flyaway.service.LoginService;
import com.dheeraj.flyaway.service.UserRegistrationService;

import javax.servlet.http.Cookie;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet("/loginUser")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUserServlet() {
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
		String userId =request.getParameter("username");
		String password =request.getParameter("password");
		
		LoginService loginService = new LoginService();
		
		String result = loginService.getUser(userId, password);
		
		if (result.equals("user not found")) {
			out.println("user not found!!!!");
		} else {

			HttpSession session = request.getSession();
			session.setAttribute("name", result);
			response.sendRedirect("dashboard.jsp");

		}
	}

}
