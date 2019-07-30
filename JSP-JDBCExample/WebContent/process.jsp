<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.sql.*"%>
 <%
 	  String dname = "com.mysql.jdbc.Driver";
 	  String url = "jdbc:mysql://localhost:3306/mydb";
 	  String uname = "root";
 	  String password = "yatrik@prince";
 	  try{
 	  Class.forName(dname);
 	  Connection con = DriverManager.getConnection(url,uname,password);
      Statement st = con.createStatement();
      String username= request.getParameter("uname");
      String pwd = request.getParameter("pwd");
      String query = "select * from users;";
      ResultSet rs = st.executeQuery(query);
      while(rs.next())
      {
    	if(rs.getString("username").equals(username) && rs.getString("password").equals(pwd))
    	{
    		out.print("Sucessfully Logged in");	
    	}
    	 else
         {
       	  out.print("failed to login");
         }
      }
 	  }
 	  catch(Exception e)
 	  {
 		  out.print(e);
 	  }
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>