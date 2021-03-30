class Student {
	// 은닉된 멤버변수 --> 현재 블록 안에서만 접근 가능함.
	private String name; // 멤버변수는 은닉시키고
	private int age; 
	
	public void setName(String name) { // 메서드는 공개하고
		this.name = name;			   // 대신 파라미터 지역변수를 프로퍼티 전역변수로 선언
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 은닉된 멤버변수의 값을 읽는 방법
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Main01 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("JAVA 학생");
		s.setAge(20);
		
		String name = s.getName();
		System.out.println("이름 : " + name);
		
		int age = s.getAge();
		System.out.println("나이 : " + age);
	}

}
