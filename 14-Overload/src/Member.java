// 생성자 오버로드 Overload
public class Member {	
	private String job;
	private int age;
	
	public Member() {
		
	}

	public Member(int age) {
		this.age = age;
	}
	public Member(String job) {
		this.job = job;
	}
	public Member(String job, int age) {
		this.job = job;
		this.age = age;
	}
	public Member(int age, String job) {
		this.age = age;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Member [job = " + job + ", age = " + age + "]";
	}
	
}
