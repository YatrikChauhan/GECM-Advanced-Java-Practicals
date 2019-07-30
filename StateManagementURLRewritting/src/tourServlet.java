import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/tourServlet")
public class tourServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		if(name.equals(""))
			name = "Guest";
		out.println("<center>Sorry "+name+" <br>Web service is unable to working...</center>");
		out.close();
	}
}
