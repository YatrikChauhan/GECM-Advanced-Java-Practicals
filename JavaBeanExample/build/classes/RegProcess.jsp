<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Registration.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="regform" type="yatrik.RegForm">
		<jsp:attribute name="class" trim="true">yatrik.RegForm</jsp:attribute>
		<jsp:attribute name="scope">session</jsp:attribute>
		<jsp:body>
			<jsp:setProperty name="regform" property="*"/>
		</jsp:body>
	</jsp:useBean>
	
	<form action="RegProcessFinal.jsp">
		Username:<input type="text" name="uname"/><br>
		Phone:<input type="number" name="phone"/><br>
		Password:<input type="password" name="password"/><br>
		<input type="submit" value="Register"/><br>
	</form>
</body>
</html>