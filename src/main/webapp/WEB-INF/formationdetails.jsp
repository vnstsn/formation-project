<%@page import="models.Formation" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formation Details</title>
</head>
<body>
	<h1>Formation Details</h1>
	
	<% Formation formation = (Formation) request.getAttribute("formation"); %>
	<h1><%= formation.getTitle() %></h1>
	<p>
		<%= formation.getProgram() %>
	</p>
	<p>
	<%= formation.getNbStudents() %>
	</p>
</body>
</html>