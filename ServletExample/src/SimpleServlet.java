import java.io.*;
import javax.servlet.*;
public abstract class SimpleServlet implements Servlet
{
	ServletConfig cofig = null;
	public void init(ServletConfig config)
	{
		System.out.println("Servlet is initialized...");
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		System.out.print("<html>");
		System.out.print("<h1>Hello Simple Servlet...</h1>");
		System.out.print("</html>");
	}

	public void destroy() {
		System.out.print("Servlet is destroyed");
	}	
}
