package formdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalledServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	int k = (int) req.getAttribute("k");
	k=k*k;
	res.getWriter().println("its another servlet k + "+k);
	
	}

}
