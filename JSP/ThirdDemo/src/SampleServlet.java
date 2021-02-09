import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * convert the below class into a servlet
 * 
 * 1)HttpServlet---if u are going to work on the http protocol/service method of http servlet is not abstract
 * 2)GenericServlet-this is used in cases where the protocol is not http here the service method is abstract
 * 
 * when ever a request from client comes
 * 1) check if the object of the servlet already exists if yes
 * 		a) it will use the existing object and call the service method which will identify if the request is a get request or a post request
 */

@WebServlet("/")
public class SampleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("hi i am deployed on the web server by init method");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(req.getProtocol());
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("my first output");
	}

	@Override
	public void destroy() {
	System.out.println("object is destroyed");
	}
}
