// Java 형성평가 (1) 2번문제
package test;

public class test02 {

	public static void main(String[] args) {
		// 현재나이 변수 설정
		int age = 26;
		// 현재년도 변수 설정
		int nowYear = 2021;
		/** 출생년도 변수 설정
		* 현재년도 - 나이 + 1
		* 한국 나이는 태어나자마자 1살
		*/ 
		int bornYear  = nowYear - age + 1;
		System.out.println(bornYear + "년도에 태어났습니다.");
	}

}
