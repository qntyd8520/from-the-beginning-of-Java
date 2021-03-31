// 캐릭터 클래스의 과정과 동일하게 몬스터 클래스 구현
public class Monster implements Move, Fight {
	private String name;

	public Monster(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> " + "공격했습니다.");

	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> " + "방어했습니다.");

	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> " + "걷습니다.");

	}

	@Override
	public void run() {
		System.out.println(this.name + " >> " + "뜁니다.");

	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> " + "점프를 합니다.");

	}

}
