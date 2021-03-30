// Article의 자식클래스 QNA

public class QNAArticle extends Article{
	// 부모 클래스의 title을 질문으로 보고, 답변을 추가한다.
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String toString() {
		return "질문/답변 [글번호 = " + getNum() + ", 제목 = " + getTitle() 
		+ ", 답변 = " + answer + "]"; 
	}
}
