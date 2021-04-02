// 기본 자료형을 String으로 변환하기

public class Main04 {

	public static void main(String[] args) {
		/** 기본 자료형을 문자열로 변환하는 방법 */
		int a = 1;
		float b = 3.14F;
		boolean c = true;
		double d = 123.456D;
		long e = 123456789123456789L;
		
		/**
		 * static 메서드 valueOF
		 * ---------------------
		 * 기본 데이터 형을 String 객체로 변환해 주는 메서드
		 * 다양한 자료형에 대하여 오버로드 되어있다
		 */
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		String str3 = String.valueOf(c);
		String str4 = String.valueOf(d);
		// 하지만 문자열로 변환하는 가장 손쉬운 방법은 공백을 더하는 것이다.
		String str5 = "" + e;
		
		System.out.println(str1 instanceof String);
		System.out.println(str2 instanceof String);
		System.out.println(str3 instanceof String);
		System.out.println(str4 instanceof String);
		System.out.println(str5 instanceof String);
	}

}
