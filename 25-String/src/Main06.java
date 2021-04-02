// 줄바꿈, 따옴표, 탭 등을 표현하는 특수문자
/**
 * 이스케이프 문자
 * ---------------
 * 프로그램의 문자열 안에 포함될 수 있는 특수 문자.
 * ex) 문자열 안에서 쌍따옴표를 표현하고자 하는 경우 사용한다
 */
public class Main06 {

	public static void main(String[] args) {
		String src = "JAVA";
		
		// 문자열 안에 쌍따옴표 포함시키기.
		System.out.println("\"" + src);
		System.out.println("------------------");
		
		// 문자열 안에 홑따옴표 포함시키기.
		System.out.println("\'" + src);
		System.out.println("------------------");
		
		// 줄바꿈 문자
		System.out.println("\n" + src);
		System.out.println("------------------");
		
		// 탭키에 해당하는 문자
		System.out.println("\t" + src);
		
	}

}
