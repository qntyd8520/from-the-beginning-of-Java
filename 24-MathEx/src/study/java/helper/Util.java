package study.java.helper;

/**
 * 기본적인 공통 기능들을 묶어 놓는 클래스
 */
public class Util {
	// 공통 기능을 모아 놓기 위한 Util클래스의 준비
	// study.java.helper패키지안에 Utli 클래스 만들기
	// 앞으로 남은단원들 에서는 다른곳에서 활용가능한 기능들을 helper패키지에 작성

	// 싱글톤 객체 생성 시작
	private static Util current;

	public static Util getInstance() {
		if (current == null) {
			current = new Util();
		}
		return current;
	}

	public static void freeInstance() {

		current = null;
	}
	 
	private Util() {
		super();
	}
	// 싱글톤 객체 생성 끝

	/**
	 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	 * @param min - 범위 안에서의 최소값
	 * @param max - 범위 안에서의 최대값
	 * @return min ~ max 안에서의 랜덤값
	 */
	public int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}
}
