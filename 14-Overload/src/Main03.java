
public class Main03 {

	public static void main(String[] args) {
		Article a1 = new Article(1);
		System.out.println(a1.toString());

		Article a2 = new Article(2, "테스트 결과물");
		System.out.println(a2.toString());

		Article a3 = new Article(3, "두 번째 게시물", "자바학생");
		System.out.println(a3.toString());

	}

}
