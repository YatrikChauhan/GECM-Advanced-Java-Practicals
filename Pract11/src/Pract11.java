import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Pract11")
public class Pract11 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		@SuppressWarnings("rawtypes")
		Enumeration em = req.getHeaderNames();
		while(em.hasMoreElements())
		{
			String str = (String)em.nextElement();
			String str2 = req.getHeader(str);
			out.print(str+"=");
			out.print(str2+"<br>");
		}
	}
}
