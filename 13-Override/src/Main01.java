// 변수 할당과 최종 출력 Main클래스

public class Main01 {

	public static void main(String[] args) {
		Army am = new Army("육군");
		Navy nv = new Navy("해군");
		AirForce af = new AirForce("공군");
		
		// Army 메소드 호출
		am.attack();
		am.tank();
		// Navy 메소드 호출
		nv.attack();
		nv.nucleus();
		// AirForce 메소드 호출
		af.attack();
		af.bombing();

	}

}
