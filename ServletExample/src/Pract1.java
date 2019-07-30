import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Pract1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Pract1() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1;
		int num2;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		if(num1>num2)
		{
			out.println("Max is ="+num1);
		}
		else
		{
			out.println("Max is ="+num2);
		}
	}
}
