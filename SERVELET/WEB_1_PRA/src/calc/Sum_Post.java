package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum_Post extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num_1"));
		int num2 = Integer.parseInt(req.getParameter("num_2"));
		out.println("SUM OF TWO VALUE IN POST "+(num1+num2));
		
	}

}