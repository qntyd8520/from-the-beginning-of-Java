
public class Main01 {

	public static void main(String[] args) {
		// 여러번 사용이 가능.
		f();
		f();
	}
	
	public static void f() {
		int x = 100;
		int y = x + 1;
		System.out.println(y);
	}

}
