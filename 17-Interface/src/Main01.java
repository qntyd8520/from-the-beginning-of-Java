// 주인공과 몬스터가 등장하는 메인 클래스 
public class Main01 {

	public static void main(String[] args) {
		// 주인공
		Character ch = new Character("주인공");
		ch.walk();
		ch.run();
		ch.attack();
		ch.shield();

		System.out.println("--------------");

		Monster mon = new Monster("악당");
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();

	}

}
