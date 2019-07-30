<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! String name,dob; %>
	<%
		name = request.getParameter("txtname");
		dob = request.getParameter("dob");
		
		Cookie c = new Cookie("name",name);
		response.addCookie(c);
		Cookie c1 = new Cookie("dob",dob);
		response.addCookie(c1);
		
	%>
	<jsp:forward page="display.jsp"></jsp:forward>
</body>
</html>