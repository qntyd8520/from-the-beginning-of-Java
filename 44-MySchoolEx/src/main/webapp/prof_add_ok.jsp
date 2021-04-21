<%@page import="study.java.myschool.service.impl.ProfessorserviceImpl"%>
<%@page import="study.java.myschool.service.ProfessorService"%>
<%@page import="study.java.myschool.MyBatisConnectionFactory"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="study.java.myschool.model.Professor"%>
<%@page import="org.apache.logging.log4j.LogManager"%>
<%@page import="org.apache.logging.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	// 이전 페이지에 대한 파라미터 받기
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String userid = request.getParameter("userid");
	String position = request.getParameter("position");
	int sal = Integer.parseInt(request.getParameter("sal"));
	String hiredate = request.getParameter("hiredate");
	int comm = Integer.parseInt(request.getParameter("comm"));
	int deptno = Integer.parseInt(request.getParameter("deptno"));

	/** 처리 결과를 기록할 Log4J 객체 생성 **/
	// 파라미터는 현재 클래스의 이름(String)
	// --> import org.apache.logging.log4j.LogManager;
	// --> import org.apache.logging.log4j.Logger;
	Logger logger = LogManager.getFormatterLogger("prof_add_ok.jsp");

	/** 저장될 데이터를 담고 있는 Beans 객체 생성 */
	// --> import study.java.myschool.model.Professor;
	Professor prof = new Professor();
	prof.setName(name);
	prof.setUserid(userid);
	prof.setPosition(position);
	prof.setSal(sal);
	prof.setHiredate(hiredate);
	prof.setComm(comm);
	prof.setDeptno(deptno);

	/** 데이터베이스 접속 **/
	// --> import org.apache.ibatis.session.SqlSession;
	SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
	
	/**  데이터 처리 수행 */
	// 비지니스 로직을 위한 Service 객체 생성
	ProfessorService professorService = new ProfessorserviceImpl(sqlSession, logger);

	try{
		// 학생 저장하기
		professorService.addProfessor(prof);
		// 저장결과를 데이터베이스에 반영하기
		sqlSession.commit();
	} catch (NullPointerException e) {
		// 저장된 데이터가 없는 경우
		logger.error("저장된 데이터가 없습니다.");
	} catch (Exception e) {
		// SQL문에 문제가 있는 경우.
		// 데이터베이스로부터 전달되는 에러메시지를 상세히 확인하기 위하여
		//  e.getMessage()의 리턴값을 함께 기록한다.
		logger.error("데이터 저장에 실패했습니다." + e.getMessage());
	}
	
	/** 데이터베이스 접속 해제 **/
	sqlSession.close();
	
	// 읽기 페이지로 강제 이동
	response.sendRedirect("prof_view.jsp?profno=" + prof.getProfno());
%>

