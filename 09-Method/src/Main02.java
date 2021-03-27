
public class Main02 {

	public static void main(String[] args) {
		f1(100);
		f2(10, 20);
	}
	public static void f1(int x) {
		int y = x + 1;
		System.out.println(y);
	}
	public static void f2(int x, int y) {
		int z = x * x + y + 1;
		System.out.println(z);
	}

}
