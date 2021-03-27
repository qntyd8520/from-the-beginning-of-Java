
public class Main02 {

	public static void main(String[] args) {
		/** 정수의 나눗셈 */
		int a = 7;
		int b = 3;
		int result1 = a / b;
		System.out.println("7 / 3 = " + result1);
		
		/** 실수의 나눗셈 */
		double c = 7D;
		double d = 3D;
		double result2 = c / d;
		System.out.println("7.0 / 3.0 = " + result2);
		
		/** 정수와 실수를 계산 */
		// 에러 발생문
		// int result3 = c / d;
		// 정수와 실수로 나눌시 표기는 실수로 정수는 4byte 실수는 8byte
		double result3 = c / d;
		System.out.println("7.0 / 3 = " + result3);
		
		/** 나눗셈의 오차 */
		// 결과에 이상 없음
		System.out.println("5 % 2 = " + 5 % 2);
		// 실수형태로 출력
		System.out.println("5.2D % 2.0D = " + 5.2D % 2.0D);
		
		/** 0으로 나누기 */
		int num = 100;
		int zero = 0;
		int result4 = num / zero;
		
		// 아래는 당연히 0으로는 나눠지지 않기때문에 오류발생
		//System.out.println("100  / 0 = ", + result4);
	}

}
