package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_Value extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static PrintWriter out;
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{ 
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		out = res.getWriter();
		out.println("SUM OF NUM1 AND NUM2 "+(num1+num2));
	}
}