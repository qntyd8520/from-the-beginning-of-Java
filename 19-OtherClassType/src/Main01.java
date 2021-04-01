// inner 클래스 (people)에 대한 객체 생성하기
public class Main01 {

	public static void main(String[] args) {
		// inner클래스에대한 객체는 부모클래스에 대한 객체를 통해서만 접근 가능하다.
		People p = new People();
		People.Man man = p.new Man("철수", 19, true);
		
		// static inner 클래스는 부모클래스 자체를 통해서 접근 가능하다.
		People.Woman woman = new People.Woman("영희", 18);
		
		System.out.println(man.toString());
		System.out.println(woman.toString());

	}

}
