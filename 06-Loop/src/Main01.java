
public class Main01 {

	public static void main(String[] args) {
		int sum = 0;
		
		// i값이 1부터 100까지 증가하는 동안, i의 값을
		// sum에 누적한다.
		// i / j / z 등으로 변수를 쓰는이유는 딱히 이유없이 편해서
		for (int i = 1; i <= 100; i++) {
			//결과값 누적
			sum += i;
		}
		System.out.println(sum);
	}

}
