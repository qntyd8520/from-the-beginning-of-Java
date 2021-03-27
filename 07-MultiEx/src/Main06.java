//while문 무한반복에서 흐름제어로 홀수의 합
public class Main06 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) {
			i ++;
			if (i % 2 == 0) {
				continue;
			}
			if(i > 100) {
				break;
			}
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
