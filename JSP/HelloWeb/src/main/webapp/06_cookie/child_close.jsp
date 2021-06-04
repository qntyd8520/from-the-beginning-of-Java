<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
//파라미터 수신에 사용될 문자셋 설정
request.setCharacterEncoding("UTF-8");

// 같은 이름의 체크박스가 하나인 경우는 일반 파라미터와 처리가 동일하다.
// 체크박스가 선택되었다면 value 속성의 "Y"가 전달될 것이고,
// 선택되지 않았다면 null이 된다.
String isPopup = request.getParameter("is_popup");

// 체크박스가 선택되었다면 60초의 유효시간을 갖는 is_popup이라는 이름의 쿠키를 생성한다.
if (isPopup != null) {
	/** 전송된 값이 있는경우 저장 (혹은 덮어쓰기) **/
	String enc = URLEncoder.encode(isPopup, "UTF-8");
	Cookie info = new Cookie("is_popup", enc);
	info.setMaxAge(60); // 쿠키의 유효시간 초
	info.setPath("/"); // 쿠키가 유효한 경로 설정 ( 사이트 최상단 디렉토리 지정 )
	info.setDomain("localhost"); // 쿠키가 유효한 도메인 설정 --> 상용화 시에는 사이트에 맞게 수정
	response.addCookie(info);
}
%>
<script type="text/javascript">
	window.close();
</script>

