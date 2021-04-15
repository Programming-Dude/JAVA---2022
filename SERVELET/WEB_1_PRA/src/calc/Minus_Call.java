package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Minus_Call extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5653655655970526784L;
	static PrintWriter out;
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String oper =req.getParameter("Operators");
		//System.out.println(oper);
		out = res.getWriter();
		
		//System.out.println(oper);
		if (oper.equals("sum")) 
		{
			//System.out.println("Redirect +");
			out.println("SUM OF TWO VALUES"+(num1+num2));
		} 
		else if (oper.equals("redirect"))
		{
			//System.out.println("Redirect");
			res.sendRedirect("summinus_?num1="+num1+"&num2="+num2);
		}
		else if (oper.equals("Session"))
		{
			HttpSession session = req.getSession();
			session.setAttribute("num1", num1);
			session.setAttribute("num2", num2);
			res.sendRedirect("mul_");
		}
		else if (oper.equals("Cookie")) 
		{
			Cookie c1 = new Cookie("num1",num1+"");
			Cookie c2 = new Cookie("num2", num2+"");
			res.addCookie(c1);
			res.addCookie(c2);
			res.sendRedirect("div_@");
		}
		else 
		{
			//System.out.println("Redirect -");
			req.setAttribute("num1", num1);
			req.setAttribute("num2",num2);
			RequestDispatcher rd = req.getRequestDispatcher("/called");
			rd.forward(req, res);
		}
	}
}