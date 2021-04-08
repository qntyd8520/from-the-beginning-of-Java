// Java 형성평가 (3) 1번문제

package test03;

public class test01 {

	public static void main(String[] args) {
		// 1 ~ 100 까지 반복
		for (int i = 1; i <= 100; i++) {
			// 3의 배수이면서 5의 배수
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}

}
