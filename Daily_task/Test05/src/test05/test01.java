// JAVA 형성평가 (5) 1번문제

package test05;

public class test01 {

	public static void main(String[] args) {
		Rect r = new Rect(10, 5);

		System.out.println(r.toString());

		int a = r.getArea();
		int b = r.getRound();

		System.out.println("사각형의 면적 : " + a);
		System.out.println("사각형의 둘레 : " + b);
	}

}
