package study.java.program;
// 작성한 Article 클래스의 기능 확인하기

import study.java.bbs.Article;
//다른패키지에 있는 클래스를 불러올때는 import키워드를 사용하여 어느패키지인지 경로를 적어주어야한다.
// 에러발생한 구문에 마우스오버하여 import추가하기로 자동으로 사용할수도있다.
public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫 번째 글 제목", "2014-01-01");
		Article a2 = new Article(2, "두 번째 글 제목", "2015-02-01");
		Article a3 = new Article(3, "세 번째 글 제목", "2016-03-01");
		
		// 출력결과에서 모든 객체가 동일한 count값을 갖는다.
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println("----------------");
		
		// static 변수의 값을 변경하면, 모든 객체가 영향을 받는다.
		Article.setCategory("공지사항");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}

}
