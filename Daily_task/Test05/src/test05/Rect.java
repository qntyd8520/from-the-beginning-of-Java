package test05;

public class Rect extends Shape {
	/**
	 * 생성자
	 * 
	 * @param width  - 가로길이
	 * @param height - 세로길이
	 */
	private int width;
	private int height;

	public Rect(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
	}

	/** 면적을 구해서 리턴한다. */

	@Override
	public int getArea() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = x * y;
		return z;
	}

	/** 둘레의 길이를 구해서 리턴한다. */

	@Override
	public int getRound() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = (x * 2) + (y * 2);
		return z;
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

	@Override
	public String toString() {
		return "Shape [width=" + this.width + ", height=" + this.height + "]";
	}

}
