
public class Main02 {

	public static void main(String[] args) {
		// 일반 변수
		int width = 100;
		// 살수
		final double PI = 3.14D;
		
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
		
		// 값의 변경
		width = 200;
		// 이 라인은 에러가 발생한다.
		// PI = 3.141582D;
		
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
	}

}
