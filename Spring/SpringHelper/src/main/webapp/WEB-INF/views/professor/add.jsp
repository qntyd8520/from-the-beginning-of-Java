<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>Hello JSP</title>
<style>
label[for] {
	display: inline-block;
	width: 80px;
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<h1>교수추가</h1>
	<form action="${pageContext.request.contextPath }/professor/add_ok.do"
		method="post">
		<div>
			<label for="dname">교수이름 : </label> <input type="text" name="name"
				id="name" />
		</div>
		<div>
			<label for="userid">아이디 : </label> <input type="text" name="userid"
				id="userid" />
		</div>
		<div>
			<label for="position1">직급 : </label> <label> <input
				type="radio" name="position" id="position1" value="교수" />교수
			</label> <label> <input type="radio" name="position" id="position2"
				value="부교수" />부교수
			</label> <label> <input type="radio" name="position" id="position3"
				value="전임강사" />전임강사
			</label> <label> <input type="radio" name="position" id="position4"
				value="조교" />조교
			</label>
		</div>
		<div>
			<label for="sal">급여 : </label> <input type="number" name="sal"
				id="sal" />
		</div>
		<div>
			<label for="hiredate">입사일 : </label> <input type="date"
				name="hiredate" id="hiredate" />
		</div>
		<div>
			<label for="comm">보직수당 : </label> <input type="range" name="comm"
				id="comm" min="0" max="100" value="0" />
		</div>
		<div>
			<label for="deptno">소속학과 : </label> <select name="deptno" id="deptno">
				<%--조회결과에 따른 반복 처리 --%>
				<c:forEach var="item" items="${output }" varStatus="srtatus">
					<option value="${item.deptno }">${item.dname }</option>
				</c:forEach>
			</select>
		</div>
		<hr />
		<button type="submit">저장하기</button>
		<button type="reset">다시작성</button>
	</form>
</body>
</html>


