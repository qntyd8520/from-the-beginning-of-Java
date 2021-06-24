package study.jsp.model2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServletMain 서블릿 클래스. 모든 서블릿은 javax.servlet.http.HttpServlet을 상속받아야 한다.
 */
// 이 클래스를 URL에 노출시키기 위한 경로
// --> http://localhost:8080/프로젝트명/HelloServlet
@WebServlet("/HelloServlet") // 이 값이 다른 클래스와 중복될경우 Tomcat자체의 실행에 문제가 발생함으로 값 지정에 주의해야한다. (이클립스 내의 모든 프로젝트 실행불가됨)
public class HelloServlet extends HttpServlet {
	
	/** 직접 객체 직렬화 아이디 수동 생성방법 ( HelloServelt에 마우스를 오버하여 Add generated serial Version ID를 클릭해서 만들어줄수 있다 ( 재발급 ) **/
	private static final long serialVersionUID = -5401482623263289310L; 
	
	/** 객체 직렬화 아이디 --> 이클립스가 생성한 값을 사용하게 된다. (자동생성방식) **/
	// private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 생성자 ( 특별한 경우가 아니면 사용안함 )
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 브라우저가 별도의 파라미터 없이 접속되거나 HTTP GET 방식으로 접근한 경우 실행된다.
	 * @param request = JSP의 request 내장객체
	 * @param response = JSP의 response 내장객체
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 브라우저가 HTTP POST 방식으로 접근한 경우 실행된다.
	 * 기본 코드는 현재 클래스의 doGet() 메서드를 호출해서 프로그램의 흐름을
	 * doGet() 메서드 한곳에서만 처리하도록 제시하고 있다.
	 * @param request = JSP의 request 내장객체
	 * @param response = JSP의 response 내장객체
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); // 한번에 사용하기 위해서 doPost()메서드 안에 doGet()도 포함시켜서 적용
	}

}
