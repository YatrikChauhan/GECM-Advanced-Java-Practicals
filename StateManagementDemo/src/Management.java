import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("Management")
public class Management extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession s1 = request.getSession(true);
		s1.invalidate();
		String str = request.getParameter("uname");
		String str2 = request.getParameter("pass");
		if(str.equals("Yatrik") && str2.equals("1234"))
		{
			Cookie c = new Cookie("Name","Yatrik");
			c.setMaxAge(5000);
			response.addCookie(c);
			
			RequestDispatcher r = request.getRequestDispatcher("servlet2");
			r.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			out.print("Invalid Username & Password..");
		}
		
	}

}
