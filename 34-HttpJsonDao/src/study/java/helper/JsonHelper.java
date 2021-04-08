package study.java.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.json.JSONException;
import org.json.JSONObject;

// 통신 결과를 JSONObject 형태로 리턴하는 Helper만들기

public class JsonHelper {
	// -------- 싱글톤 객체 생성 시작 --------
	private static JsonHelper current = null;

	public static JsonHelper getInstance() {
		if (current == null) {
			current = new JsonHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private JsonHelper() {
		super();
	}
	// -------- 싱글톤 객체 생성 끝 --------

	/**
	 * InputStream 객체를 JSONObject객체로 변환하여 리턴한다.
	 * 
	 * @param is      - InputStream 객체
	 * @param encType - InputStream이 읽어들인 Xml의 인코딩 형식
	 * @return JSONObject
	 */
	public JSONObject getJsonObject(InputStream is, String encType) {
		JSONObject json = null;

		// InputStream의 내용을 저장할 문자열
		String source = null;

		BufferedReader reader = null;
		try {
			String line = null;
			StringBuilder sb = new StringBuilder();
			reader = new BufferedReader(new InputStreamReader(is, encType));
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			source = sb.toString();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // end try ~ catch ~ finally

			try {
				json = new JSONObject(source);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			
		}
		return json;
	}
}
