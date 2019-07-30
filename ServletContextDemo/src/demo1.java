import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("demo1")
public class demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext context = request.getServletContext();
		context.setAttribute("Enroll", 015);
		String str = context.getInitParameter("name");
		String str1 = context.getServerInfo();
		String str2 = context.getAttribute("Enroll").toString();
		out.print("Name="+str+"<p>");
		out.print("Server info="+str1+"<p>");
		out.print("Enroll="+str2);
		
		context.removeAttribute("Enroll");
		out.print("<p>Atribute remove successfully.");
	}

}
