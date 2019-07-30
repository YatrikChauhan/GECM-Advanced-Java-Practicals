import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.http.*;
@WebServlet("/Pract8")
public class Pract8 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String str1 = req.getParameter("uname");
		String str2 = req.getParameter("enno");
		String str3 = req.getParameter("phone");
		String[] str4 = req.getParameterValues("ck");
		
		out.print("Enroll. no:"+str2+"<p>");
		out.print("Name:"+str1+"<p>");
		out.print("Phone:"+str3+"<p>");
		out.print("Hobbies:");
		out.print("<ul>");
		
		for(String s : str4)
		{
			out.print("<li>"+s+"</li>");
		}
		out.print("<ul>");
	}
}
