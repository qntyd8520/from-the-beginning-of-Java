// 객체 배열과 객체 형변환 같이 사용하기
// 객체 배열을 만드는 이유는 게임에서 부대지정하는것처럼 일괄적으로 사용하기 위하여

public class Main02 {

	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];

		units[0] = new AirForce("공군1호");
		units[1] = new AirForce("공군1호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군1호");

		// 객체 배열로 선언후 반복문을 통해서 부대 일괄 공격
//		for (int i = 0; i < units.length; i++) {
//			units[i].attack();
//		}
//		System.out.println("------------------");

		// 하위클래스에있는 추가한 기능도 사용하기위하여
		// 명시적 형변환 이후 반복문을 통해서 부대 일괄 공격
		for (int i = 0; i < units.length; i++) {
			units[i].attack();

			if (units[i] instanceof Army) { // instanceof 연산자는 원래 클래스가맞는지 불대수로 확인
				Army a = (Army) units[i];
				a.tank();
			} else if (units[i] instanceof Navy) {
				Navy n = (Navy) units[i];
				n.nucleus();
			} else if (units[i] instanceof AirForce) {
				AirForce f = (AirForce) units[i];
				f.bombing();
			}
		}
	}

}
