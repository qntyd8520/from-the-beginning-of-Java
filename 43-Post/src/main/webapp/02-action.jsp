<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	//파라미터 수신에 사용할 문자셋 설정 (각 페이지당 최상단 에서 1회 설정)
	request.setCharacterEncoding("UTF-8");
	// <input> 태그의 name속성값을 사용하여 사용자의 입력값을 받는다.
	String userName = request.getParameter("user_name");

	// 해당 파라미터가 존재하지 않는 경우
	if (userName == null){
		userName = "이름이 없습니다.";
	}

	// 앞, 뒤 공백제거
	userName = userName.trim();
		
	if (userName.equals("")){
		userName = "이름을 입력하세요.";
	}
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
		<h1><%=userName %></h1>
	</div>
</body>
</html>


