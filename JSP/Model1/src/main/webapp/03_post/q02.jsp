<%@page import="study.jsp.model1.helper.RegexHelper"%>
<%@page import="study.jsp.model1.helper.WebHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	WebHelper webHelper = WebHelper.getInstance(request, response);
	// regexHelper rorcp todtjd
	RegexHelper regexHelper = RegexHelper.getinstance();
	
	// POST 파라미터 수신. 값이 없을 경우 기본값 null이 리턴됨
	String userName = request.getParameter("user_name");
	String userEmail = request.getParameter("user_email");
	String userTel = request.getParameter("user_tel");
	
	
	// 이름에 대한 값이 없다면 메시지 출력후 이전 페이지로 강제 이동후 종료 (return)
	if (!regexHelper.isValue(userName)) {
		webHelper.redirect(null, "이름을 입력하세요.");
		return;
	}
	
	// 이름이 한글 이외의 글자가 포함되어 있다면 메시지 출력후 이전 페이지로 강제 이동후 종료 (return)
	if (!regexHelper.isKor(userName)) {
		webHelper.redirect(null, "이름은 한글만 입력 가능합니다.");
	}
	
	// 이메일에 대한 값이 없다면 메시지 출력후 이전 페이지로 강제 이동후 종료 (return)
	if (!regexHelper.isValue(userEmail)) {
		webHelper.redirect(null, "이메일을 입력하세요.");
		return;
	}
	
	// 이메일에 대한 형식이 잘못되었다면 메시지 출력후 이전 페이지로 강제 이동후 종료 (return)
	if (!regexHelper.isEmail(userEmail)) {
		webHelper.redirect(null, "이메일 형식이 잘못되었습니다.");
		return;
	}
	
	// 연락처가 입려되지 않았다면 메시지 출력후 이전 페이지로 강제 이동 후 종료 (return)
	if (!regexHelper.isValue(userTel)) {
		webHelper.redirect(null, "연락처를 입력하세요.");
		return;
	}
	
	// 연락처가 행드폰 형식도 아니고 집전화 형식도 아니라면 메시지 출력후 이전 페이지로 강제 이동 후 종료 (return)
	if (!regexHelper.isCellPhone(userTel) && !regexHelper.isTel(userTel)) {
		webHelper.redirect(null, "연락처 형식이 잘못되었습니다.");
		return;
	}
%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>My JSP Page</title>
</head>
<body>
	<h1>간단 설문조사 2/3</h1>
	<h2>성별 선택</h2>
	
	<form action="<%=request.getContextPath()%>/03_post/q03.jsp" name="myform" method="post">
		<!-- 이전 화면에서 넘어온 값에 대한 상태 유지 -->
		<input type="hidden" name="user_name" value="<%=userName%>" />
		<input type="hidden" name="user_email" value="<%=userEmail%>" />
		<input type="hidden" name="user_tel" value="<%=userTel%>" />
		
		<!-- 설문항목 -->
		<div>
			<label>
				<input type="radio" name="gender" value="남자" checked="checked"> 남자 
			</label>
			<label>
				<input type="radio" name="gender" value="여자"> 여자 
			</label>
		</div>
		<button type="submit">다음단계</button>
	</form>
</body>
</html>


