package study.java.model;

public class ImageItem {
	private String collection = null;
	private String datetime = null;
	private String display_sitename = null;
	private int width = 0;
	private int height = 0;
	private String doc_url = null;
	private String image_url = null;
	private String thumbnail_url = null;

	public ImageItem(String collection, String datetime, String display_sitename, int width, int height, String doc_url,
			String image_url, String thumbnail_url) {
		super();
		this.collection = collection;
		this.datetime = datetime;
		this.display_sitename = display_sitename;
		this.width = width;
		this.height = height;
		this.doc_url = doc_url;
		this.image_url = image_url;
		this.thumbnail_url = thumbnail_url;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getDisplay_sitename() {
		return display_sitename;
	}

	public void setDisplay_sitename(String display_sitename) {
		this.display_sitename = display_sitename;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getThumbnail_url() {
		return thumbnail_url;
	}

	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}

	@Override
	public String toString() {
		return "ImageItem [collection=" + collection + ", datetime=" + datetime + ", display_sitename="
				+ display_sitename + ", width=" + width + ", height=" + height + ", doc_url=" + doc_url + ", image_url="
				+ image_url + ", thumbnail_url=" + thumbnail_url + "]";
	}

}
