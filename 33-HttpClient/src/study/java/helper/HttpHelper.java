package study.java.helper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
// HttpHelper 클래스 생성

public class HttpHelper {
	// -------- 싱글톤 객체 생성 시작 --------
	private static HttpHelper current = null;

	public static HttpHelper getInstance() {
		if (current == null) {
			current = new HttpHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private HttpHelper() {
		super();
	}
	// -------- 싱글톤 객체 생성 끝 --------

	public InputStream getWebData(String url, String encType) {
		/******** (1) 접속 설정 *********/
		// 접속 대기에 대한 제한 시간 --> 밀리세컨드 단위
		int timeout = 30000;

		// 통신객체
		HttpClient client = null;
		// 접속을 하기 위한 기본 환경설정 객체
		HttpParams params = new BasicHttpParams();
		// 프로토콜 버전 설정
		params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
		// 요청 제한 시간
		HttpConnectionParams.setConnectionTimeout(params, timeout);
		// 응답 체한 시간
		HttpConnectionParams.setSoTimeout(params, timeout);
		// 통신에 사용할 인코딩 값 설정
		HttpProtocolParams.setContentCharset(params, encType);
		// 접속 기능을 하는 객체 생성
		client = new DefaultHttpClient(params);

		/******** (2) 접속하기 ********/
		// 응답 결과가 저장될 객체
		InputStream is = null;

		// 통신에 필요한 요청 정보 설정 --> URL을 주소 표시줄에 입력하기
		HttpGet httpget = new HttpGet(url);

		// 요청을 보낸 후, 응답 받기
		try {
			HttpResponse response = client.execute(httpget);

			// 웹 서버의 응답 결과 코드 받기
			// 404 : Page Not Found (주소 오타, 파일 없음)
			// 500 : Server Error(개발자잘못)
			// 200 : OK
			int resultCode = response.getStatusLine().getStatusCode();

			// 서버 응답이 정상일 경우에만 처리
			if (resultCode == HttpURLConnection.HTTP_OK) {
				// 수신된 응답에서 실 데이터 추출
				HttpEntity entity = response.getEntity();
				BufferedHttpEntity buffer = new BufferedHttpEntity(entity);

				// 추출한 데이터를 InputStream으로 변환
				is = buffer.getContent();
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 통신 해제 ( 항상 수행되어야 재접속이 가능)
			client.getConnectionManager().shutdown();
		}
		// 통신 결과 리턴
		return is;
	}
}
