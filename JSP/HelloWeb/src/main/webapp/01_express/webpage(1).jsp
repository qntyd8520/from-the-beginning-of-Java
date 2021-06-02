<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	int a = 100; // 정수형 변수 a에 100할당
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
	<% 
		a += 100; //a를 100증가. 이전 블록에서 생성한 변수를 사용하게 된다.
	%>
</head>
<body>
	<div class="container">
		<h1>Hello JSP</h1>
		<% 
			out.println(a); //변수값 출력하기. 200이 출력된다. <% >는 묶여서 한번에 처리된다.
		%>
	</div>
</body>
</html>


