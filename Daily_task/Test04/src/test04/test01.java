// JAVA 형성평가 (4) 1번문제

package test04;

class Square {
	int width, height;
	
	Square(){
		
	}
	Square(int width, int height){
		this.width = width;
		this.height = height;
	}
	int getArea() {
		return (width * height);
	}
	int getRound() {
		return ((width + height) * 2);
	}
}
	


public class test01 {

	public static void main(String[] args) {
		// 사각형의 가로, 세로 길이를 생성자에게 전달한다.
		Square s = new Square(3, 2);
		
		
		System.out.println("사각형의 넓이 -> " + s.getArea() + "제곱cm");
		System.out.println("사각형의 둘레 -> " + s.getRound() + "cm");
	}

}

