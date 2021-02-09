package com.FirstApplication.Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/contactus")
public class MyThirdPage extends GenericServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("hi from server");

	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
