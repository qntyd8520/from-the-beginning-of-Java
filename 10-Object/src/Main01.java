// 멤버변수(프로퍼티)만 포함하고 있는 클래스의 작성 예
// 메소드는 포함되어있지않음

class Student {
	/** 멤버변수의 선언 + 할당*/
	// 문장을 표현할 수 있는 변수형
	String name = "자바학생";
	int age = 19;
}



public class Main01 {

	public static void main(String[] args) {
		/** 객체의 선언과 할당의 분리*/
		Student std;
		std = new Student();
		
		/** 객체의 생성 (일괄지정) */
		// Student std = new Studen();
		
		System.out.println("이름 : " + std.name);
		System.out.println("나이 : " + std.age);
	}

}
