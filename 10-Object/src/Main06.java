class Book {
	String subject;
	String content;
	
	// 생성자 --> 객체가 생성될 때, 자동으로 실행되는 특수한 메서드
	// 특징 : 리턴형을 명시하지 않는다. 클래스와 이름이 동일하다.
	Book(){
		System.out.println("-----생성자 실행됨-----");
		this.subject = "JAVA입문";
		this.content = "JAVA는 어쩌구 저쩌구....";		
	}
	
	void read( ) {
		System.out.println("------read() 실행됨------");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main06 {

	public static void main(String[] args) {
		Book book = new Book();
		book.read();
	}

}
