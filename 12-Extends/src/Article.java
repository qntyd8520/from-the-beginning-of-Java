// 공통 기능을 구현하는 클래스 ( Article ) 부모 클래스
public class Article {
	// 글 번호
	private int num;
	// 글 제목
	private String title;

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

}
