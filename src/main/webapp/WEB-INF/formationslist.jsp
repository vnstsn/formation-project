<%@page import="java.util.List"%>
<%@page import="formationProject.models.Formation" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formations list</title>
</head>
<body>
 	<div style="text-align: center">
	
		<h1>Formations List</h1>
		
		<ul>
			<% for (Formation formation : (List<Formation>) request.getAttribute("formations")) { %>
			<li> 
 				<a href="/formationslist?title=<%= formation.getTitle() %>"><%= formation.getTitle() %></a>
			</li>
			<% } %>
		</ul>
	</div>
</body>
</html>