/**
 * 랜덤값 생성하기 --------------------------- Math.random() 매서드는 0~1범위를 갖는 double형의 값을
 * 리턴하기 때문에, 원하는 범위의 값을 생성하기 위해서는 일련의 공식 적용이 필요하다.
 */
public class Main03 {
	// 랜덤값 생성하기
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Main03.random(1, 10));
		System.out.println(Main03.random(11, 20));

	}

	// 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	public static int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}

}
