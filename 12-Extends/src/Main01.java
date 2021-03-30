// CalcParent 와 CalcChil를 황용하는 메인 클레스

public class Main01 {

	public static void main(String[] args) {
		CalcParent parent = new CalcParent();

		System.out.println(parent.plus(100, 50));
		System.out.println(parent.minus(100, 50));

		System.out.println("-------------");

		CalcChild child = new CalcChild();
		System.out.println(child.plus(200, 100));
		System.out.println(child.minus(200, 100));
		System.out.println(child.times(200, 100));
		System.out.println(child.divide(200, 100));

	}

}
