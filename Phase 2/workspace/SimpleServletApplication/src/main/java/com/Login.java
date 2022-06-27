package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");			// This code is use to receive email from form 
		String pass = request.getParameter("pass");				// This code is use to receive passwrod from form
		if(email.equals("ajay@gmail.com") && pass.equals("123")) {
			pw.println("Successfully login with Get method ");
		}else {
			pw.println("Failure try once again with Get method");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");			// This code is use to receive email from form 
		String pass = request.getParameter("pass");				// This code is use to receive passwrod from form
		if(email.equals("ajay@gmail.com") && pass.equals("123")) {
			pw.println("Successfully login with Post method");
		}else {
			pw.println("Failure try once again with Post method");
		}
	}

}
