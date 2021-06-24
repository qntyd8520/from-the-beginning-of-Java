<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>SimpleMVC</title>
</head>
<body>
	<!-- 반복문 -->
	<c:forEach var="i" begin="1" end="10" step="2">
		<h1>${i}</h1>
	</c:forEach>
</body>
</html>


