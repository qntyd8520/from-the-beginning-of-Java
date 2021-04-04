// JAVA 형성평가 (4) 2번문제

package test04;

class Book{
	String Title;
	int Price;
	String Author;
	String Publisher;
	String PubDate;
	
	Book(String Title, int Price, String Author, String Publisher, String PubDate){
		this.Title = Title;
		this.Price = Price;
		this.Author = Author;
		this.Publisher = Publisher;
		this.PubDate = PubDate;
	}
	public String toString() {
		return ("Book [" + "title=" + this.Title + ", " + "price=" + this.Price + ", " + 
	"author=" + this.Author + ", " + "publisher=" + this.Publisher + ", " + 
				"pubDate" + this.PubDate + "]");
	}
	
	void setTitle(String Title) { this.Title = Title; }
	void setPrice(int Price) { this.Price = Price; }
	void setAuthor(String Author) { this.Author = Author;}
	void setPublisher(String Publisher) { this.Publisher = Publisher;}
	void setPubDate(String PubDate) { this.PubDate = PubDate;}

	String getTitle() {return this.Title;}
	int getPrice() { return this.Price; }
	String getAuthor() { return this.Author;}
	String getPublisher() { return this.Publisher;}
	String getPubDate() {return this.PubDate;}
}



public class test02 {

	public static void main(String[] args) {
		// 생성자 파라미터 --> 제목, 가격, 저자, 출판사, 출간일
		Book book = new Book("모바일 웹 퍼플리싱", 35100, "주영아", "인터프레스",
				"2012-12-21");
		System.out.println(book.toString());
		
		// 제목 설정하기
		book.setTitle("Javascript+jQuery+Ajax 완벽가이드");
		// 가격 설정하기
		book.setPrice(29700);
		// 저자 설정하기
		book.setAuthor("주영아, 이광호");
		// 출판사 설정하기
		book.setPublisher("Interpress");
		// 출간일 설정하기
		book.setPubDate("2014-11-25");
		
		System.out.println("제목 : " + book.getTitle());
		System.out.println("가격 : " + book.getPrice());
		System.out.println("저자 : " + book.getAuthor());
		System.out.println("출판사 : " + book.getPublisher());
		System.out.println("출간일 : " + book.getPubDate());

		
		
	}

}
