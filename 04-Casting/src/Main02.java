
public class Main02 {

	public static void main(String[] args) {
		long l = 100L;
		int i = (int) l;
		short s = (short) i;
		
		System.out.println("l = " + l);
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		
		double pi1 = 3.14D;
		// 큰 범위의 변수를 작은 범위의 변수에 대합하는 것은 에러!
		// ex) int pi2 = pi1;
		
		// 명시적 형변환이 필요하다.
		int pi2 = (int) pi1;
		
		System.out.println("pi1 = " + pi1);
		System.out.println("pi2 = " + pi2);
		
		// 'a'에 해당하는 아스키 코드
		int num1 = 97;
		// 99에 해당하는 아스키 코드는 c
		char c2 = (char) (num1 +2);
		System.out.println("c2 = " + c2);
	}

}
