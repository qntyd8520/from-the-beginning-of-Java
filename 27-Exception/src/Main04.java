// Main02.java에 try ~ catch를 적용시키기 ( 예외처리 )

public class Main04 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			for (int i = 0; i < 5; i++) {
				arr[i] = i; // i 가 3일때 배열초과로 에러가 발생하여 catch구문으로 이동한다
				System.out.println(arr[i]);			
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생");
			System.out.println("원인 : " + e.getMessage());
		}
		System.out.println("-------프로그램을 종료합니다.---------");
	}

}
