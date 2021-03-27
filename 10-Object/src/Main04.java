class Calc {
	int plus(int x, int y) { 
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int times(int x, int y) {
		return x * y;
	}
	
	int divide(int x, int y) {
		int reslut = 0;
		if ( y != 0 ) {
			reslut = x / y;
		}
		return reslut;
	}
	int f(int x, int y) {
		int result = plus(x, y) + times(x, y);
		return result;
	}
}
public class Main04 {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		int p = c.plus(100, 50);
		System.out.println("100 + 50 = " + p);
		
		System.out.println("100 - 50 = " + c.minus(100, 50));
		System.out.println("100 * 50 = " + c.times(100, 50));
		System.out.println("100 / 50 = " + c.divide(100, 50));
		System.out.println("f(100, 50) = " + c.f(100, 50));
	}

}
