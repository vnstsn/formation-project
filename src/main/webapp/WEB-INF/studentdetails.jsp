<%@page import="models.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>Student Details</h1>
	<% Student student = (Student) request.getAttribute("student"); %>
	<h1><%= student.getName() %></h1>
	<p>
		<%= student.getFirstName() %>
	</p>
	<p>
	<%= student.getAge() %>
	</p>
	<p>
	<%= student.getNote() %>
	</p>
	<p>
	<%= student.getFormation() %>
	</p>
</body>
</html>