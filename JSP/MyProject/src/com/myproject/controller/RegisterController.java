package com.myproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.BL.RegisterBL;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String custname=request.getParameter("custname").toString();
		String custemail=request.getParameter("custemail").toString();
		String custphno=request.getParameter("custphno").toString();
		String custpassword=request.getParameter("custpassword").toString();
		if(RegisterBL.addCustomer(custname, custemail, custphno, custpassword))
		{
			request.setAttribute("regsuccess","Successfuly Registered Login to Check");
			rd=request.getRequestDispatcher("HomePage.jsp");
		}
		else
		{
			request.setAttribute("regfailed","Registration Failed Please Try Later");
			rd=request.getRequestDispatcher("Register.jsp");
		}
		rd.forward(request, response);
	}

}
