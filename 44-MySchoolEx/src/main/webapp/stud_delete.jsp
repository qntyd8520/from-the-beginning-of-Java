<%@page import="study.java.myschool.service.impl.StudentserviceImpl"%>
<%@page import="study.java.myschool.service.StudentService"%>
<%@page import="study.java.myschool.MyBatisConnectionFactory"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="study.java.myschool.model.Student"%>
<%@page import="org.apache.logging.log4j.LogManager"%>
<%@page import="org.apache.logging.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	request.setCharacterEncoding("utf-8");
	String studno_str = request.getParameter("studno");
	int studno = 0;
	
	if (studno_str != null){
		studno = Integer.parseInt(studno_str);
	}
	
	/** 처리 결과를 기록할 Log4J 객체 생성 **/
	// 파라미터는 현재 클래스의 이름(String)
	// --> import org.apache.logging.log4j.LogManager;
	// --> import org.apache.logging.log4j.Logger;
	Logger logger = LogManager.getFormatterLogger("stud_add_ok.jsp");
	
	/** 저장될 데이터를 담고 있는 Beans 객체 생성 */
	// --> import study.java.myschool.model.Student;
	Student stud = new Student();
	stud.setStudno(studno);
	
	/** 데이터베이스 접속 **/
	// --> import org.apache.ibatis.session.SqlSession;
	SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
	
	/** 데이터 처리 수행 **/
	// 비지니스 로직을 위한 Service 객체 생성
	// --> import study.java.myschool.service.StudentService;
	// --> import study.java.myschool.service.impl.StudentserviceImpl;	
	StudentService studentService = new StudentserviceImpl(sqlSession, logger);
	
	try{
		// 학생 삭제하기
		studentService.deleteStudent(stud);
		// 삭제결과를 데이터베이스에 반영하기
		sqlSession.commit();
		// 처리 결과를 로그에 기록하기
		logger.debug("데이터 삭제 완료");
	} catch (NullPointerException e){
		logger.error("삭제된 데이터가 없습니다.");
	} catch (Exception e){
		logger.error("데이터 삭제에 실패했습니다." + e.getMessage());
	}
	
	/** 데이터베이스 접속 해제 **/
	sqlSession.close();
	
	// 목록 페이지로 강제 이동
	response.sendRedirect("stud_list.jsp");

%>



