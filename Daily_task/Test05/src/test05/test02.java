// JAVA 형성평가 (5) 2번문제

package test05;

public class test02 {

	public static void main(String[] args) {
		Rect r = new Rect(0, 0);

		int a = r.getArea(20, 5);
		System.out.println(r.toString());
		System.out.println("사각형의 면적 : " + a);

		int b = r.getRound(30, 10);
		System.out.println(r.toString());
		System.out.println("사각형의 둘레 : " + b);

	}

}
