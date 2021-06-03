<%@page import="study.helloweb.model.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
request.setCharacterEncoding("UTF-8");
String deptno = request.getParameter("deptno");
Department department = null;

if (deptno != null) {
	department = new Department();
	
	if (deptno.equals("101")){
		department.setDeptno(101);
		department.setDname("컴퓨터공학과");
		department.setLoc("1호관");
	} else if (deptno.equals("102")){
		department.setDeptno(102);
		department.setDname("멀티미디어학과");
		department.setLoc("2호관");
	} else if (deptno.equals("201")){
		department.setDeptno(201);
		department.setDname("전자공학과");
		department.setLoc("3호관");
	} else if (deptno.equals("202")){
		department.setDeptno(202);
		department.setDname("기계공학과");
		department.setLoc("4호관");
	}
}
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>My JSP Page</title>
</head>
<body>
	<h1>학과정보</h1>

	<!-- 메뉴 제시 영역 -->
	<a
		href="<%=request.getContextPath()%>/04_get/department.jsp?deptno=101">컴퓨터공학과</a>
	|
	<a
		href="<%=request.getContextPath()%>/04_get/department.jsp?deptno=102">멀티미디어학과</a>
	|
	<a
		href="<%=request.getContextPath()%>/04_get/department.jsp?deptno=201">전자공학과</a>
	|
	<a
		href="<%=request.getContextPath()%>/04_get/department.jsp?deptno=202">기계공학과</a>
	<hr/>

	<!-- 결과표시 영역 -->
	<% if (department == null) { %>
	<h2>메뉴를 선택하세요</h2>
	<% } else { %>
	<table>
		<tr>
			<th>학과번호</th>
			<td><%=department.getDeptno() %></td>
		</tr>
		<tr>
			<th>학과이름</th>
			<td><%=department.getDname() %></td>
		</tr>
		<tr>
			<th>학과위치</th>
			<td><%=department.getLoc() %></td>
		</tr>
	</table>
	<% } // end if %>
</body>
</html>


