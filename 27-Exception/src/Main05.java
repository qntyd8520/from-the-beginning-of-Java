// 복합적 예외 상황에 대응하기
public class Main05 {
// try ~ catch 구문 사용하지않고 중간구문 확인시 문자를 숫자로 변환후 저장하려해서 에러발생
	public static void main(String[] args) {

		// 사용자의 입력값을 가정
		String[] src = { "가", "2", "aaa", "ccc" };

		// src의 내용들을 숫자로 변환해서 저장할 배열
		int[] arr = new int[3];

		try {
			for (int i = 0; i < src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(arr[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("입력값에 오류가 있습니다.");
			// 개발자가 보려는 용도로 출력하는 시스템 에러 메시지
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터가 너무 많습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			// 예외 종류를 의미하든 모든 클래스는
			// java.lang.Exception 클래스를 상속받으므로,
			// 이 블록은 모든 종류의 예외에 대처할 수 있다.
			System.out.println("알 수 없는 예외가 발생했습니다.");
			e.printStackTrace();
		} finally {
			// 이 finally는 예외의 발생 여부에 상관없이 무조건 실행된다.
			System.out.println("데이터 변환 종료");
		}

		System.out.println("---------프로그램을 종료합니다.----------");
	}

}