// 주인공 클래스 만들기     implements로 인터페이스 상속시켜주기
public class Character implements Action, Move, Fight {

	private String name;

	public Character(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> " + "공격");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> " + "방어");

	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> " + "걷다");

	}

	@Override
	public void run() {
		System.out.println(this.name + " >> " + "뛰다");

	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> " + "점프");

	}

	@Override
	public void pickup() {
		System.out.println(this.name + " >> " + "아이템을 줍다.");

	}
}
