<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<% 
	String color = "blue";
%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>My JSP Page</title>
	<!-- Twitter Bootstrap3 & jQuery -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />
	<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Hello JSP</h1>
	</div>
	<% 
		if (color.equals("red")) {
			out.println("<h1 style='color: red' > Hello JSP </h1>");
		} else {
			out.println("<h1 style='color: blue' > Hello JSP </h1>");
		}
	%>
	
	<% 
		if (color.equals("red")) { %>
			<h2 style='color: red'> 안녕하세요. JSP </h2>
		<% } else { %>
		<h2 style="color: blue"> 안녕하세요. JSP </h2>
	<% } %>
</body>
</html>


