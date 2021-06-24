package study.jsp.model2.helper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseController
 */
// @WebServlet("/BaseController")
public abstract class BaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet() 생성자 처리
	 */
	public BaseController() {
		// 실행되는 주체를 확인하기 위해서 클래스이름을 콘솔에 출력한다.
		String className = this.getClass().getName();
		System.out.println(className);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) Get Post 방식에 상관없이 하나의 메서드로 처리
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 공통처리 메서드로 제어를 이동시킨다.
		this.pageInit(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) Get Post 방식에 상관없이 하나의 메서드로 처리
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 공통처리 메서드로 제어를 이동시킨다.
		this.pageInit(request, response);
	}
	
	/**
	 * Get, Post 방식에 상관없이 공통 처리되는 메서드
	 * @param request - JSP request 내장객체
	 * @param response - JPS response 내장객체
	 */
	private void pageInit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 페이지 형식 지정하기
		response.setContentType("text/html; charset=utf-8");
		// 파라미터 형식 지정하기
		request.setCharacterEncoding("utf-8");
		
		// View의 이름
		String view = doRun(request, response);
		
		// 획득한 View가 존재한다면 화면 표시
		if (view != null) {
			// null아 아니면 view를 생성한다
			view = "/WEB-INF/views/" + view + ".jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}
	
	/** 웹페이지 구성에 필요한 처리를 수행한 후 , view의 이름을 리턴한다. 
	 * 이 메서드를 추상화 한다.
	 * 이클래스를 상속받는 자식 클래스는 반드시 이 메서드를 재정의 해야 한다.
	 **/
	public abstract String doRun(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;

}
