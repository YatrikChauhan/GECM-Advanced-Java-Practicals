import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/welcomeServlet")
public class welcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		Cookie c = new Cookie("uname",uname);
		response.addCookie(c);
		c.setMaxAge(60);
		out.println("<center>welcome "+uname+"</center>");
		out.println("<center><br><form action=tourServlet method=get><input type=submit value=\"take a tour\"></form></center>");
		out.close();
	}

}
