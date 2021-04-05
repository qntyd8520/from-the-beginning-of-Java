// 예외상황의 이해를 위한 예제 (2)

public class Main02 {

	public static void main(String[] args) {
		int[] arr = new int[3];

		for (int i = 0; i < 5; i++) {
			// 배열의 크기를 초과하는 위치에 접근하기때문에 에러가 발생한다.
//			arr[i] = i; // <<- i가 3일때 에러 발생
			// 위에 구문으로 에러발생시 고전적인 에러방지 방법
			if (i < arr.length) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
	}

}
