import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HttpServletRequestDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public HttpServletRequestDemo() {
        super();
      }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("getMethod="+request.getMethod()+"<p>");
		out.println("getPathInfo="+request.getServletPath()+"<p>");
		out.println("getSession="+request.getSession()+"<p>");
		out.println("ip address="+request.getRemoteAddr()+"<p>");
		out.println("URL="+request.getRequestURL()+"<p>");
		out.println("URI="+request.getRequestURI()+"<p>");
		out.println("getCookie="+request.getCookies()+"<p>");
		out.println("getAuthType="+request.getAuthType()+"<p>");
		
	}
}
