
public class Main04 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < 10; j++) {
				int k = i * j;
				System.out.println(k);
			}
			if (i < 9) {
				System.out.println("------");
			}
		}
	}

}
