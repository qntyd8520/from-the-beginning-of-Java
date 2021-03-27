// JAVA 형성평가 (3) 7번문제

package test03;

public class test07 {

	public static void main(String[] args) {
		int [][] inven = {
				{291, 500},
				{586, 320},
				{460, 100},
				{558, 120},
				{18, 92},
				{72, 30}
		};
	
		int total = 0;
		
		for (int i = 0; i < inven.length; i++) {
			int price = inven[i][0] * inven[i][1];
			total += price * 0.9;			
		}
		
		System.out.println(" 총 골드의 합 : " + total + "G");
		
	}

}
