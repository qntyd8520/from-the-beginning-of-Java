package study.java.helper;

public class MyMathHelper {

	private static MyMathHelper current = null;

	public static MyMathHelper getInstance() {
		if (current == null) {
			current = new MyMathHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private MyMathHelper() {
		super();
	}

	public void gugu(int x) {
		for (int j = 1; j < 10; j++) {
			System.out.println(x + " x " + j + " = " + x * j);
		}

	}
}
