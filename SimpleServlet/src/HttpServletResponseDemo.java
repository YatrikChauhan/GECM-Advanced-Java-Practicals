import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HttpServletResponseDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HttpServletResponseDemo() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Cookie C = new Cookie("my_cookie","HelloYatrik");
		PrintWriter out = response.getWriter();
		response.addCookie(C);
		StringBuffer url = request.getRequestURL();
		out.print("encode Url="+response.encodeURL(url.toString())+"<p>");
		out.print("ContainsHeader="+response.containsHeader("content-type")+"<p>");
	}
}
