package test05;

public class Rect extends Shape {
	/** 
	 * 생성자
	 * @param width			- 가로길이
	 * @param height		- 세로길이
	 */
	
	public Rect(int width, int height) {
		super(width, height);
	}
	
	/** 면적을 구해서 리턴한다. */
	public int getArea() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = x * y;
		return z;
	}
	
	/** 둘레의 길이를 구해서 리턴한다. */
	public int getRound() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = (x *2) + (y * 2);
		return z;
	}
	
	
}
