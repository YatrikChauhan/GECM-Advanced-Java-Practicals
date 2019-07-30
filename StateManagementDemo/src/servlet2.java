import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] c = request.getCookies();
		out.print("CookieName\tCookieValue\tAge");
		for(int i=0;i<c.length;i++)
		{
			out.print("<p>"+c[i].getName()+"\t\t"+c[i].getValue()+"\t\t"+c[i].getMaxAge());
		}
	}

}
