import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/tourServlet")
public class tourServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] ch = request.getCookies();
		String name = "";
		if(ch!=null)
		{
			 name = ch[0].getValue();
		}
		out.println("<center>Sorry "+name+" <br>Web service is unable to working...</center>");
		out.close();
	}
}
