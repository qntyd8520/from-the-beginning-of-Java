package test05_02;

public class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
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

	/** 면적을 구해서 리턴한다. */
	public int getArea(int x, int y) {
		this.width = x;
		this.height = y;
		return (this.width * this.height);
	}

	/** 둘레의 길이를 구해서 리턴한다. */
	public int getRound(int x, int y) {
		this.width = x;
		this.height = y;
		return (width * 2) + (height * 2);
	}
}
