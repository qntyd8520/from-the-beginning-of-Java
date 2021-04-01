// singleTon 객체의 사용방법

public class Main02 {

	public static void main(String[] args) {

		Calc loader1 = Calc.getInstance();
		loader1.plus(100, 50);

		Calc.getInstance().minus(100, 50);
		// minus()뒤에 .plus()로 체인연장이 안되는이유는 리턴이 자기자신(Calc)이아닌
		// 각각의 int값 이니까 안되다.

	}

}