
public class Main01 {

	public static void main(String[] args) {
		AirForce af = new AirForce("공군");
		Navy nv = new Navy("해군");
		Army am = new Army("육군");

		// 각각의 객체는 자신들의 고유 기능을 사용할수 있음
		af.bombing();
		nv.nucleus();
		am.tank();

		System.out.println("------------------");

		// 모든 객체는 자신의 상위 형태로 암묵적 형변환 가능
		Unit temp1 = af;
		Unit temp2 = nv;
		Unit temp3 = am;

		// 형변환이 되더라도 상속받거나 재정의한(Override)
		// 자신들의 기본 특성들은 그대로 유지함.
		temp1.attack();
		temp2.attack();
		temp3.attack();

		System.out.println("-----------------");

		// 상위 클래스 형태로 형변환이 되면, 자신들의 독립 기능은 사용하지 못한다
//		temp1.bombing();
//		temp2.nucleus();
//		temp3.tank();

		AirForce re1 = (AirForce) temp1;
		Navy re2 = (Navy) temp2;
		Army re3 = (Army) temp3;

		re1.bombing();
		re2.nucleus();
		re3.tank();
	}

}
