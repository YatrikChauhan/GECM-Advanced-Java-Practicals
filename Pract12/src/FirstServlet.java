import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String name=request.getParameter("userName");
		String pwd=request.getParameter("password");
		 if(pwd.equals("Yatrik") && name.equals("admin"))
		 {
			  out.print("<h1>Welcome "+name+"</h1>");
			  Cookie ck=new Cookie("uname",name);
			  response.addCookie(ck);
			  out.print("<b>Cookie has been generated for this session<br></b>");
			  out.print("<b>Click on button to view Cookie...</b>");
			  out.print("<form action='SecondServlet' method='post'>");
			  out.print("<br><input type='submit' value='go'>");
			  out.print("</form>");
		}
		else
		{
			out.println("Incorrect Username or Password!!!");
		}
	}

}
