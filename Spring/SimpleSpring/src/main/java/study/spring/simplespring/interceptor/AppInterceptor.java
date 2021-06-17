package study.spring.simplespring.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import uap_clj.java.api.Browser;
import uap_clj.java.api.Device;
import uap_clj.java.api.OS;

@Slf4j
public class AppInterceptor implements HandlerInterceptor {

	long startTime = 0, endTime = 0;

	/**
	 * 자주 사용되는 기능 Controller 실행 요청 전에 수행되는 메서드 클라이언트의 요청을 컨트롤러에 전달하기 전에 호출된다.
	 * return값으로 boolean 값을 전달하는데 false인 경우 controller를 실행시키지 않고 요청을 종료한다. 보통 이곳에서
	 * 각종 체크작업과 로그를 기록하는 작업을 진행한다.
	 */
	@SuppressWarnings("unchecked") // 경고 끄기
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// log.debug("AppInterceptor.preHandle 실행됨");

		// 컨트롤러 실행 직전에 현지 시각을 저장한다.
		startTime = System.currentTimeMillis();

		/** 1) 클라이언트의 요청 정보 확인하기 **/
		// 현재 URL 획득
		String url = request.getRequestURI().toString();

		// GET방식인지 POST방식인지 조회
		String methodName = request.getMethod();

		// URL에서 "?"이후에 전달되는 GET파라미터 문자열을 모두 가져온다.
		String queryString = request.getQueryString();

		// 가져온 값이 있다면 URL과ㅗ 결합하여 완전한 URL을 구성한다.
		if (queryString != null) {
			url = url + "?" + queryString;
		}

		// 획득한 정보를 로그로 표시한다.
		log.debug(String.format("[%s] %s", methodName, url));

		/** 2) 클라이언트가 전달한 모든 파라미터 확인하기 **/
		Map<String, String[]> params = request.getParameterMap();

		for (String key : params.keySet()) {
			String[] value = params.get(key);
			log.debug(String.format("(p) <-- %s = %s", key, String.join(",", value)));
		}
		/** 3) 클라이언트가 머물렀던 이전 페이지와 이전 페이지에 머문 시간 확인하기 **/
		// 이전에 머물렀던 페이지
		String referer = request.getHeader("referer");

		// 이전 종료 시간이 0보다 크다면 새로운 시작시간과의 차이는 이전 페이지에 머문 시간을 의미한다.
		if (referer != null && endTime > 0) {
			log.debug(String.format("-REFERER : time=%d, url=%s", startTime - endTime, referer));
		}

		/** 4) 접속한 클라이언트의 장치 정보를 로그로 기록 **/
		// 접근한 클라이언트의 HTTP헤더 정보 가져오기

        // 라이브러리의 기능을 통해 UserAgent 정보 파싱 **/
    	String ua = request.getHeader("User-Agent");
    	
    	// 웹 브라우저 정보
    	// --> import uap_clj.java.api.Browser;
    	Map<String, String> browser = Browser.lookup(ua);
    	// 운영체제 정보
    	// --> import uap_clj.java.api.OS;
    	Map<String, String> os = (Map<String, String>) OS.lookup(ua);
    	
    	// 디바이스 정보
    	// --> import uap_clj.java.api.Device;
    	Map<String, String> device = (Map<String, String>) Device.lookup(ua);
    	
    	
    	// 추출된 정보를 출력하기 위해 문자열로 묶기
		String browserStr = String.format("- Browser : {family=%s, patch=%s, major=%s, minor=%s}",
				browser.get("family"), browser.get("patch"), browser.get("major"), browser.get("minor"));

		String osStr = String.format("- OS : {family=%s, patch=%s, patch_minor=%s, major=%s, minor=%s}", os.get("family"),
				os.get("patch"), os.get("patch_minor"), os.get("major"), os.get("minor"));

		String deviceStr = String.format("- Device : {family=%s, patch=%s, brand%s}", device.get("family"),
				device.get("patch"), device.get("brand"));

		// 로그 저장
		log.debug(browserStr);
		log.debug(osStr);
		log.debug(deviceStr);
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	/**
	 * 자주 사용되는 기능 view 단으로 forward 되기 전에 수행. 컨트롤러 로직이 실행된 이후 호출된다. 컨트롤러 단에서 에러 발생시
	 * 해당 메서드는 수행되지 않는다. request로 넘어온 데이터 가공 시 많이 사용된다.
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// log.debug("AppInterceptor.postHandle 실행됨");

		// 컨트롤러 종료시의 시각을 가져온다.
		endTime = System.currentTimeMillis();

		// 시작시각과 종료시간의 사이의 차이를 구하여 페이지의 실행시간을 구한다.
		log.debug(String.format("running time : %d(ms)\n", endTime - startTime));
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	/**
	 * 자주 사용되지 않는 기능 !! 컨트롤러 종료후 view가 정상적으로 랜더링 된 후 제일 마지막에 실행되는 메서드
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// log.debug("AppInterceptor.afterCompletion 실행됨");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
