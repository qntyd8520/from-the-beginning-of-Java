<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String[] language = { "C,C++", "JAVA", "PHP", "JSP", "Swift" };
request.setAttribute("language", language);
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>SimpleMVC</title>
</head>
<body>
	<ul>
		<c:forEach var="k" items="${language }" varStatus="status">
			<li>language[${status.index }] = ${k}</li>
		</c:forEach>
	</ul>
</body>
</html>


