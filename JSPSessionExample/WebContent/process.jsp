<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Date createtime = new Date(session.getCreationTime());
	Date lastacesstime = new Date(session.getLastAccessedTime());
	String title = "Welcome back to my website";
	Integer visitcount = new Integer(0);
	String visitcountkey = new String("visitcount");
	String userIDKey = new String("userid");
	String userID = new String("ABCD");
	
	if(session.isNew())
	{
		title = "Welcome to my website on your first visit.";
		session.setAttribute(userIDKey, userID);
		session.setAttribute(visitcountkey, visitcount);
	}
	
	visitcount = (Integer)session.getAttribute(visitcountkey);
	visitcount++;
	userID = (String)session.getAttribute(userIDKey);
	session.setAttribute(visitcountkey, visitcount);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
		<th>Session Info</th>
		<th>value</th>
		</tr>
		<tr>
			<td>id</td>
			<td><% out.print(session.getId()); %></td>
		</tr>
		<tr>
			<td>create time</td>
			<td><% out.print(createtime); %></td>
		</tr>
		<tr>
			<td>Last-acessed time </td>
			<td><% out.print(lastacesstime); %></td>
		</tr>
		<tr>
			<td>user-id</td>
			<td><% out.print(userID); %></td>
		</tr>
		<tr>
			<td>Number of visit</td>
			<td><% out.print(visitcount); %></td>
		</tr>
	</table>
</body>
</html>