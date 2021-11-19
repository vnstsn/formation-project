<%@page import="java.util.List"%>
<%@page import="models.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
</head>
<body>
	<div style="text-align: center">
	
		<h1>Students List</h1>
		
		<ul>
			<% for (Student student : (List<Student>) request.getAttribute("students")) { %>
			<li> 
 				<a href="/formationProject/studentdetails?name=<%= student.getName() %>"><%= student.getName() %></a>
			</li>
			<% } %>
		</ul>
	</div>
</body>
</html>