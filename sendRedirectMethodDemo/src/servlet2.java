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

		int k = Integer.parseInt(request.getParameter("c"));
		out.print("add is:"+k+"<p>");
		int ans = k * k;
		out.print("Square is:"+ans);
	}

}
