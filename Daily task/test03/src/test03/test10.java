// JAVA 형성평가 (3) 10번문제

package test03;

public class test10 {

	public static void main(String[] args) {
		int[] price = {38000, 20000, 17900, 17900};
		int[] qty = {6, 4, 3, 5};
		
		
		Integer[]top = new Integer[price.length];
		
		for (int i = 0; i < price.length; i++) {
			top[i] = price[i] * qty[i];
		}
		
		int count = 0;
		for (int i = 0; i < top.length; i++) {
			if (top[i] >= 80000) {
				count++;
			}
			else {
				count += 0;
			}
		}
		System.out.println("top");
		System.out.print("무료배숑 항목 : " + count + "건");
	}

}
