class Article {
	int seq;	// 글 번호
	String subject;		// 글 제목
 	String writer;	//작성자
 	/** 
 	 * 파라미터가 존재하는 생성자
 	 * -->파라미터에 의해서 멤버변수의 값을 초기화 한다.
 	 */
 	
 	public Article(int seq, String subject, String writer) {
 		this.seq = seq;
 		this.subject = subject;
 		this.writer = writer;
 	}
 	
 	public void print() {
 		System.out.println(this.seq);
 		System.out.println(this.subject);
 		System.out.println(this.writer);
 	}

}
public class Main07 {

	public static void main(String[] args) {
		Article article1 = new Article(1, "자바연습 첫 번째 입니다.", 
				"자바학생");
		article1.print();
		
		System.out.println("----------");
		
		Article article2 = new Article(2, 
				"자바는 객체지향 언어입니다.", "자바강사");
		article2.print();
		
	}

}
