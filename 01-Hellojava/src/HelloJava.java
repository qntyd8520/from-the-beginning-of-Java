/**
 * 프로그램 소스의 최소 단위(=class) 를 명시하는 블록,
 * --> public class 클래스 이름
 * 클래스 이름은 소스파일의 이름과 동일해야 하며, 영어/숫자/언더바(_)만
 * 사용 가능하다.
 * 첫글자는 반드시 영어로만 구성되어야 한다.
 */
public class HelloJava {
	/**
	 * 프로그램의 시작점을 의미하는 블록(중괄호) --> main 메서드
	 * 라고한다.
	 */
	public static void main(String[] args) {
		// 콘솔에 문장을 출력하기 위한 명령어
		// 문장을 표현하는 방법 --> 쌍따옴표("")로 묶는다.
		// --> 문자열 str
		System.out.println("Hello Java");
	}

}
