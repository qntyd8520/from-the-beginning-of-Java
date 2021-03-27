
public class Main07 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			default:
				System.out.println("Not-Pass");
				break;
		}
	}

}
