// 군인 공통 특성을 표현한 클래스 부모클래스에 해당

public class Unit {
	private String name;

	public Unit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println(this.name + " >> 공격준비");
	}

}
