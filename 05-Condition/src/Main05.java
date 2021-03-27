
public class Main05 {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("91~100점 사이 입니다.");
			break;
		case 'B':
			System.out.println("81~90점 사이 입니다.");
			break;
		case 'C':
			System.out.println("71점~80점 사이 입니다.");
			break;
		default:
			System.out.println("70점 이하입니다.");
			break;			
		}
	}

}
