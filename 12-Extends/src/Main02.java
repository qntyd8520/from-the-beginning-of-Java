// 출력을 위한 메인 메서드

public class Main02 {

	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);
		fileArticle.setTitle("첫 번째 자료 입니다.");
		fileArticle.setFileName("java.ppt");
		System.out.println(fileArticle.toString());

		System.out.println("------------");

		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("첫 번째 질문입니다.");
		qna.setAnswer("첫 번째 답변입니다.");
		System.out.println(qna.toString());

	}

}
