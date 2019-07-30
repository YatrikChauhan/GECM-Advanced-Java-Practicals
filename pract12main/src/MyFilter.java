import java.io.*;
import javax.servlet.*;
public class MyFilter implements Filter {
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		PrintWriter pw=resp.getWriter();
		String pwd=req.getParameter("password");
		if(pwd.equals("yatrik"))
		{
			chain.doFilter(req, resp);
		}
		 else
		{
			 pw.print("Invalid Password");
			 RequestDispatcher redi=req.getRequestDispatcher("login.html");
			 redi.include(req, resp);
		 } 

	}
}
