// JAVA 형성평가 (3) 9번문제

package test03;

import java.util.Arrays;
import java.util.Collections;

public class test09 {

	public static void main(String[] args) {
		int[] price = {38000, 20000, 17900, 17900};
		int[] qty = {6, 4, 3, 5};
		
		
		Integer[]top = new Integer[price.length];
		
		for (int i = 0; i < price.length; i++) {
			top[i] = price[i] * qty[i];
		}
		
		Arrays.sort(top,Collections.reverseOrder());
		System.out.println("top");
		System.out.print("가장 높은 상품금액 : " + top[0] + "원");
		
	}

}
