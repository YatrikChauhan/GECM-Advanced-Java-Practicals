import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("SessionExample")
public class SessionExample extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession s1 = request.getSession(true);
		if(s1.isNew())
		{
			if(request.getParameter("uname").equals("Yatrik") && request.getParameter("pass").equals("1234"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("servlet3");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/LoginFile.html");
				rd.include(request, response);
				out.print("Invalid Username & Password..");
			}
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("servlet3");
			rd.forward(request, response);
		}
	}
}

