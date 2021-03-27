
public class Main03 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= 100; i++) {
			//2로 나눈 나머지가 0이면 짝수
			if (i % 2 == 0) {
				sum1 += i;
			}
			else {
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
