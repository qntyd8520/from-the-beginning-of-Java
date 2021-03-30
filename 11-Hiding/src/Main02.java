/** 하나의 소스파일에는 하나의 public 클래스만 존재할수 있기때문에,
 * Member클래스를 다른파일로 나누어 놓았다.
 */
public class Main02 {

	public static void main(String[] args) {
		Member s = new Member("JAVA학생", 20);
		
		String name = s.getName();
		System.out.println("이름 : " + name);
		
		int age = s.getAge();
		System.out.println("나이 : " + age);
	}

}
