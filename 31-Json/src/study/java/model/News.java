package study.java.model;
// main04 번과 연동되는 JavaBeans
public class News {
	private String title;
	private String descroption;
	private String pubDate;
	public News(String title, String descroption, String pubDate) {
		super();
		this.title = title;
		this.descroption = descroption;
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescroption() {
		return descroption;
	}
	public void setDescroption(String descroption) {
		this.descroption = descroption;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "News [title=" + title + ", descroption=" + descroption + ", pubDate=" + pubDate + "]";
	}
	
	
}
