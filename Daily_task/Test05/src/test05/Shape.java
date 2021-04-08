package test05;

public class Shape {
	private int width;
	private int height;
	private int Area;
	private int Round;

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
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

	public int getArea() {
		return Area;
	}

	public void setArea(int area) {
		Area = area;
	}

	public int getRound() {
		return Round;
	}

	public void setRound(int round) {
		Round = round;
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}

}
