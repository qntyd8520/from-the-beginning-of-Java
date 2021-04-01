// 이 클래스가 어떠한 패키지에 소속되어 있는지를 명시한다. 
// 보통자동으로 추가되나 버그로 추가가 안되면 확인후 작성해주기.
package study.java.bbs;
/**
 * 하나의 게시물을 표한하기 위한 JavaBeans
 */
// 게시물을 표현하기 위한 클래스를 구성
public class Article {
	
	/** static은 모든 객체가 공유되는 값이다. static값은 클래스 이름을 통해서
	 * 접근해야하며, 객체의 생성 여부에 상관없이 사용이 가능하다. 
	 */
	// 전체 게시물의 수를 표현하기 위한 데이터
	private static int count = 0;
	// 모든 게시물은 하나의 카테고리안에 존재한다고 가정한다.
	// 게시물의 분류를 구별하기 위한 데이터
	private static String category;
	// 글번호
	private int num;
	
	// 글제목
	private String title;
	
	// 작성일시
	private String regDate;

	public Article(int num, String title, String regDate) {
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
	// 이 클래스에 대한 객체 생성 --> 게시물 신규 등록
	// 게시물이 새로 등록될 때 마다, 전체 글 수를 의미하는
	// count변수가 1씩 증가한다.
	// 전체 게시물 수는 모든 객체가 공유하는 값이므로, 
	// static으로 생성되어야 한다
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "글 분류 = " + category + ", 전체 글 수 = " + count + 
				" Article [num=" + num + ", title=" + title + ", regDate=" + regDate + "]";
	}


}
