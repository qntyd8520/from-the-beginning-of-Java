// JAVA 형성평가 (3) 8번문제

package test03;

public class test08 {

	public static void main(String[] args) {
		int[] price = {38000, 20000, 17900, 17900};
		int[] qty = {6, 4, 3, 5};
		
		int total = 0;
		
		for (int i = 0; i < price.length; i++) {
			int sum = price[i] * qty[i];
			total += sum;
		}
		
		System.out.println("전체 결재 금액 : " + total + "원");
	}

}
