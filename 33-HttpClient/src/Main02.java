import java.io.IOException;
import java.io.InputStream;

import study.java.helper.HttpHelper;

// 완성된 Helper 클래스의 활용

public class Main02 {

	public static void main(String[] args) {
		/******** (1) 접속 설정 ********/
		// 접속할 웹 페이즈 주소
		String url = "http://itpaper.co.kr/demo/java/hello.txt";
		// 데이터를 읽기위한 인코딩 형식
		String encType = "UTF-8";
		
		/******** (2) 읽은 값을 복사할 변수 선언 및 초기화 ********/
		String result = null;
		
		/******** (3) 접속하기 ********/
		InputStream is = HttpHelper.getInstance().getWebData(url, encType);
		
		// 예외처리
		if (is == null) {
			System.out.println("통신 실패");
			return;
		}
		
		/******** (4) 받은 응답에 대한 결과 처리 ********/
		try {
			byte[] buffer = new byte[is.available()];
			is.read(buffer);
			result = new String(buffer, encType);
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
