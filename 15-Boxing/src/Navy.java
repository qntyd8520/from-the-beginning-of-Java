// Navy클래스 부모는 Unit클래스

public class Navy extends Unit {
	public Navy(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 어뢰 발사!!");
		System.out.println(this.getName() + " >> 지상 상륙");
	}

	public void nucleus() {
		System.out.println(this.getName() + " >> 핵미사일");
	}

}
