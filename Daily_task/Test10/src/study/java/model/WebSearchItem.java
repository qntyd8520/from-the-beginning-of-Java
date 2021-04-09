package study.java.model;

public class WebSearchItem {
	private String authors = null;
	private String contents = null;
	private String datetime = null;
	private String isbn = null;
	private int price = 0;
	private String publisher = null;
	private int sale_price = 0;
	private String status = null;
	private String thumbnail = null;
	private String title = null;
	private String translators = null;
	private String doc_url = null;

	public WebSearchItem(String authors, String contents, String datetime, String isbn, int price, String publisher,
			int sale_price, String status, String thumbnail, String title, String translators, String doc_url) {
		super();
		this.authors = authors;
		this.contents = contents;
		this.datetime = datetime;
		this.isbn = isbn;
		this.price = price;
		this.publisher = publisher;
		this.sale_price = sale_price;
		this.status = status;
		this.thumbnail = thumbnail;
		this.title = title;
		this.translators = translators;
		this.doc_url = doc_url;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getSale_price() {
		return sale_price;
	}

	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTranslators() {
		return translators;
	}

	public void setTranslators(String translators) {
		this.translators = translators;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}

	@Override
	public String toString() {
		return "WebSearchItem [authors=" + authors + ", contents=" + contents + ", datetime=" + datetime + ", isbn="
				+ isbn + ", price=" + price + ", publisher=" + publisher + ", sale_price=" + sale_price + ", status="
				+ status + ", thumbnail=" + thumbnail + ", title=" + title + ", translators=" + translators
				+ ", doc_url=" + doc_url + "]";
	}

}
