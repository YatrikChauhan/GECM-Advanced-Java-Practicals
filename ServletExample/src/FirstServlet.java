import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My server Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello..How are You</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}