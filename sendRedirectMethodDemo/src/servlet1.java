import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int a = Integer.parseInt(request.getParameter("no1"));
		int b = Integer.parseInt(request.getParameter("no2"));
		
		int c = a + b;
		
		response.sendRedirect("servlet2?c="+c);
	}

}
