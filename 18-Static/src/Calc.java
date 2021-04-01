// singleTon 객체 생성을 위한 클래스으ㅢ 기본작성구조

public class Calc {
	
	// ------ 싱글톤 객체생성을 위한 준비 시작 -------
	private static Calc current;

	public static Calc getInstance() {
		if (current == null) {
			current = new Calc();		// 객체가 할당되지 않은경우에만
		}                           	// 할당하도록 중복할당을 방지한다.
		return current;
	}

	public static void freeInstance() {
		// 객체에 null값을 대입하면 메모리에서 삭제된다.
		current = null;
	}
	
	// 기본생성자를 private로 은닉하게 되면 new를 통한 객체생성이 금지된다.
	private Calc() {
		super();
	}
	// ------ 싱글톤 객체 생성을 위한 준비 끝 -------
	
	// 이 클래스가 구현해야 하는 기능
	public void plus(int x, int y) {
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}
	
	public void minus(int x, int y) {
		int z = x - y;
		System.out.println(x + " - " + y + " = " + z);
	}
}
