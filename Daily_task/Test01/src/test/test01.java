// Java 형성평가 (1) 1번문제

package test;

public class test01 {

	public static void main(String[] args) {
		// 출생년도 변수 설정
		int year = 1996;
		// 현재년도 변수 설정
		int nowYear = 2021;
		/**
		 * 현재나이 변수 설정 현재년도 - 출생년도 + 1 한국 나이는 태어났을때 1살
		 */
		int age = nowYear - year + 1;
		System.out.println(age + "세 입니다.");
	}

}
