
public class Main05 {

	public static void main(String[] args) {
		// x1값과 y1값의 결과 확인
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		System.out.println("-----------");
		
		// x2값과 y2값의 결과 확인
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
		
		// x 는 둘다 1씩 증가해서 2이다
		// 하지만 y 는 y1은 100 + 1 이후 x가 독립적으로 증가했고
		// y2는 x값이 증가후 100 + 2의 결과로 대입된다
	}

}
