// 메서드를 포함한 클래스

class HelloWorld {
	String message;
	
	void SayHello() { System.out.println(message); }
	void SetEng() { message = "Hello Jave"; }
	void SetKor() { message = "안녕하세요. 자바"; }
}

public class Main03 {

	public static void main(String[] args) {
		// 클래스의 호출
		HelloWorld hello = new HelloWorld();
		
		// 메서드의 호출
		hello.SetEng();
		hello.SayHello();
		
		hello.SetKor();
		hello.SayHello();
	}

}
