// Java 형성평가 (2) 3번문제

package test02;

public class test03 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}