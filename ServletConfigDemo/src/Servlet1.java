import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig(); 
		String str = config.getInitParameter("Name");
		out.print("Name = "+str+"<p>");
		out.print("Servlet name = "+config.getServletName()+"<p>");
		out.print("ServletContext object = "+config.getServletContext()+"<p>");
	}
}
