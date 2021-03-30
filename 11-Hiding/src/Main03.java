// Article 소스코드와 연결

public class Main03 {

	public static void main(String[] args) {
		Article article = new Article(1, "테스트 게시물", 
				"JavaBeans를 테스트 합니다.", "자바학생", 123, 
				"2010-01-01");
		System.out.println(article.getSeq());
		System.out.println(article.getSubject());
		System.out.println(article.getContent());
		System.out.println(article.getWriter());
		System.out.println(article.getHit());
		System.out.println(article.getRegDate());
	}

}
