
public class Main06 {

	public static void main(String[] args) {
		char grade = 'B';
		
		// break절이 없는 경우의 switch문
		switch (grade) {
			case 'A':
				System.out.println("91점~100점 사이 입니다.");
			case 'B':
				System.out.println("81점~90점 사이 입니다.");
			case 'C':
				System.out.println("71점~80점 사이 입니다.");
			default:
				System.out.println("70점 이하 입니다.");
		}
	}

}
