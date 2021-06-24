<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String message = "Hello World";
int mynumber = 1234567890;
request.setAttribute("message", message);
request.setAttribute("mynumber", mynumber);
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>SimpleMVC</title>
</head>
<body>
	<h1>함수 사용하기</h1>
	<h2>${message }</h2>

	<ul>
		<li>fn:toUpperCase >> ${fn:toUpperCase(message)}</li>
		<li>fn:toLowerCase >> ${fn:toLowerCase(message)}</li>
		<li>fn:subString >> ${fn:substring(message, 0, 5)}</li>
		<li>fn:substringBefore >> ${fn:substringBefore(message, "l")}</li>
		<li>fn:substringAfter >> ${fn:substringAfter(message, "W")}</li>
		<li>fn:replace >> ${fn:replace(message, "World", "Jsp")}</li>
		<li>fn:trim >> ${fn:trim(message)}</li>
	</ul>
	
	<h2>형식문자</h2>
	<fmt:formatNumber value="${mynumber }" pattern="#,###" />
</body>
</html>


