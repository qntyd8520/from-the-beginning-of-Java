// JAVA 형성평가 (3) 11번문제

package test03;

import java.util.Arrays;

public class test11 {

	public static void main(String[] args) {
		Integer[] price = {209000, 109000, 119000, 109000, 94000};
		
		System.out.println("상품가격 --> " + Arrays.toString(price));
		
		Arrays.sort(price);
		System.out.println("낮은가격순 --> " + Arrays.toString(price));	

	}

}
