// 첫 번째 예제 try ~ catch 구문을 이용하여 에외처리 하기

public class Main03 {

	public static void main(String[] args) {

		try {
			String year2 = "뭘까요?";
			int age2 = 2014 - Integer.parseInt(year2) + 1; // try블록 안에서 에러발생시 
			System.out.println(age2);					   // catch블록으로 바로 점프한다.
		} catch (NumberFormatException e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());

		}
		System.out.println("-------프로그램을 종료합니다.-------");
	}

}
