import javax.servlet.*;
import java.io.*;
public class helloWorld extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public helloWorld() {
        super();
    }
    
    ServletConfig cofig = null;
	public void init(ServletConfig config)
	{
		this.cofig = config;
		System.out.println("Servlet is initialized...");
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello Simple Servlet...</h1>");
		out.print("</body></html>");
	}

	public void destroy() {
		System.out.print("Servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}	
}
