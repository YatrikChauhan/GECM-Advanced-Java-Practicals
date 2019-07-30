<jsp:useBean id="regform" type="yatrik.RegForm" scope="session"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Registration.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	UserName:<jsp:getProperty name="regform" property="uname"/><br>
	Phone:<jsp:getProperty name="regform" property="phone"/><br>
	Password:<jsp:getProperty name="regform" property="password"/><br>
	<form action="javascript:alert("Remaining process under devlopment...")" method="post">
	<input type="submit" value="Register"/>
	</form>
</body>
</html>