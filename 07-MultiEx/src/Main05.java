// while문 반복으로 구구단 
public class Main05 {

	public static void main(String[] args) {
		int i = 2; 
		int j = 1;
		
		while (i <= 9) {
			while (j < 10) {
				int k = i * j;
				System.out.println(k);
				j++;
			}
			if (i < 9) {
				System.out.println("---------");
			i++;
			j = 1;
			}
			
		}
	}

}
