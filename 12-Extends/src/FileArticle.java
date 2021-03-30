// Article의 자식클래스 File

public class FileArticle extends Article {
	// 자료의 확장 --> 파일이름
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "자료실 [번호 = " + getNum() + ", 제목 = " + getTitle() + 
				", 첨부파일 = " + fileName + "]";
	}

}
