import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * the below class need to be executed when the request contains /sample3
 */
public class Sample3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("the get protocol from the dd implementation");
		System.out.println("when ever we make changes the old object that was created must be destroyed");
		System.out.println("destroy is called");
	}
}
