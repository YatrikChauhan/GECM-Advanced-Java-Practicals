import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		 Cookie ck[]=request.getCookies();
		 out.print("Value stored in Cookie : "+ck[0].getValue());

	}

}
