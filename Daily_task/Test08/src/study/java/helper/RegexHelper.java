package study.java.helper;

import java.util.regex.Pattern;

public class RegexHelper {
	// 싱글톤 객체 생성
	private static RegexHelper current = null;

	public static RegexHelper getInstance() {
		if (current == null) {
			current = new RegexHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private RegexHelper() {
		super();
	}
	// 싱글톤 객채 생성 끝

	// 빈값이 없을때만 값을 할당해주기
	public boolean isValue(String str) {
		boolean result = false;
		if (str != null) {
			result = !str.trim().equals("");
		}
		return result;
	}

	// 주민번호 형식과 맞는지 검사
	public boolean isJumin(String str) {
		boolean result = false;
		if (isValue(str)) {
			result = Pattern.matches("^\\d{6}[1-4]\\d{6}", str);
		}
		return result;
	}

}