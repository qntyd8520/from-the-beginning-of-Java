<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>My JSP Page</title>
</head>
<body>
	<h1>팝업창</h1>
	<p>opener.jsp에 의해서 열러진 팝업창 입니다.</p>
	
	<form action="child_close.jsp" method="post">
		<label>
			<input type="checkbox" name="is_popup" value="Y"> 1분간 창 열지 않음
		</label>
		<button type="submit">닫기</button>
	</form>
</body>
</html>


