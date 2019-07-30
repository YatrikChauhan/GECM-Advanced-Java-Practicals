import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/pract10")
public class pract10 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletContext s = getServletContext();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		if(uname.equals("Yatrik") && pass.equals("1234"))
		{
		RequestDispatcher rd =req.getRequestDispatcher("Servlet2");
		rd.forward(req, res);
		}
		else
		{
			out.print("Invalid Username and Password..<br><br>");
			RequestDispatcher r = req.getRequestDispatcher("/info1.html");
			r.include(req, res);
		}
	}
}
