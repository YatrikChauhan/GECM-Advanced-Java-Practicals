<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Registration.html"%>
<jsp:useBean id="regform" class="yatrik.RegForm" scope="session"></jsp:useBean>
<jsp:setProperty property="uname" name="regform" param="uname"/>
<jsp:setProperty property="phone" name="regform" param="phone"/>
<jsp:setProperty property="password" name="regform" param="password"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
	your registration details are valid,
	<a href="ViewRegistrationDetails.jsp">Click me</a> to view registration details and confirm.
</pre>
</body>
</html>