package study.jsp.model2.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends BaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6012793099257247570L;

	@Override
	public String doRun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "hello";
		return view;
	}

}
