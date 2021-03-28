class Member {
	String name;
	int age;
	
	String getName() { return this.name; }
	void setName(String name) { this.name = name; }
	int getAge() { return this.age; }
	void setAge(int age) { this.age = age; }
	
	void say() {
		System.out.println(getName());
		System.out.println(getAge());
	}
}


public class Main05 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("자바학생");
		member.setAge(20);
		member.say();
	}

}

