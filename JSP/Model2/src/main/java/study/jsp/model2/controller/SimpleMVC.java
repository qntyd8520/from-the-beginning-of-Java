package study.jsp.model2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleMVC
 */
// URL 확장자는 개발자가 임의로 설정할 수 있다. (html, jsp, 등 모두 가능함)
@WebServlet("/simple_mvc.do")
public class SimpleMVC extends HttpServlet {
	
       
    /**
	 * 기본 자동생성값 삭제후 수동 재발급생성
	 */
	private static final long serialVersionUID = -7951411265730259992L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 브라우저에 전달되는 컨텐츠의 형식 지정
		response.setContentType("text/html; charset=utf-8");
		// 브라우저로부터 전달받는 파라미터의 인코딩 형식 지정
		request.setCharacterEncoding("utf-8");
		
		// 현재 서블릿의 요청을 JSP에게 전달하는 객체 생성.
		// --> Dispatcher : 전달자 라는 의미
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/simple_mvc.jsp");
		
		// 현재 서블릿의 프로그램 흐름을 "/WEB-INF/views/simple_mvc.jsp" 페이지에게 넘긴다.
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
