<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="utf-8" />
<title>Hello JSP</title>
</head>
<body>
	<h1>SpringHelper</h1>

	<h2>OpenAPI 연동</h2>
	<ul>
		<li><a
			href="${pageContext.request.contextPath}/retrofit/daily_box_office.do">
				/retrofit/daily_box_office.do</a></li>
		<li><a
			href="${pageContext.request.contextPath}/retrofit/kakao_image_search.do">
				/retrofit/kakao_image_search.do</a></li>
	</ul>
</body>
</html>

