
public class Main07 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		// 논리연산에 대한 결과는 boolean형( 불대수 )이다
		boolean result1 = a != b || a == b;
		boolean result2 = a < b || x > y;
		boolean result3 = a < b || x < y;
		boolean result4 = a > b || x > y;
		boolean result5 = a > b || x < y;
		// 파이썬과 다르게 자바에서는 and / or 표시를 두번씩
		// && / ||
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println("----------");

		// boolean ( 불대수 )값 끼리도 당연히 논리연산이 가능.
		boolean r1 = a >= b;
		boolean r2 = x >= y;
		boolean result6 = r1 && r2;
		boolean result7 = r1 || r2;
		System.out.println(result6);
		System.out.println(result7);
		System.out.println("----------");
		
		boolean success = true;
		boolean fail = !success;
		System.out.println(fail);
	}

}
