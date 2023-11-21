package formdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt( req.getParameter("num1"));
//		int j = Integer.parseInt( req.getParameter("num2"));
//		int k = i+j;
//		System.out.println("i + "+i+" j " + j +"= " + k);
//		res.getWriter().println("i + "+i+" j " + j +"= " + k);
//	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	int i = Integer.parseInt( req.getParameter("num1"));
	int j = Integer.parseInt( req.getParameter("num2"));
	int k = i+j;
	System.out.println("i + "+i+" j " + j +"= " + k);
	res.getWriter().println("its Post i + "+i+" j " + j +"= " + k);
}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	int i = Integer.parseInt( req.getParameter("num1"));
	int j = Integer.parseInt( req.getParameter("num2"));
	int k = i+j;
	System.out.println("i + "+i+" j " + j +"= " + k);
	res.getWriter().println("its get i + "+i+" j " + j +"= " + k);
	
	
	req.setAttribute("k", k);
	RequestDispatcher rd = req.getRequestDispatcher("Called");
	rd.forward(req, res);
}
	
	

}
