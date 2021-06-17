<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<html>
<head>
<title>Home</title>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.css" />
</head>
<body>
	<h1>Hello world!</h1>

	<!-- 홈 컨트롤러로 접근하기 위한 링크 -->
	<h2>HomeController</h2>
	<ul>
		<li>
			<a href="${pageContext.request.contextPath }">Home 페이지</a>
		</li>
		<li>
			<a href="${pageContext.request.contextPath }/user_agent.do">UserAgent 확인 예제</a>
		</li>
	</ul>
	
	<!-- Get/Post 테스트 -->
	<h2>ParamController</h2>
	<ul>
		<li>
		<a href="${pageContext.request.contextPath }/params/home.do">Get/Post 테스트</a>
		</li>
	</ul>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/script.js"></script>
</body>
</html>

