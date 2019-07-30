import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServlerFilter extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String str = req.getParameter("name");
		out.print("<h1>Hello "+str+"</h1><h2>You have sucessfully logged in....</h2>");

	}

}
