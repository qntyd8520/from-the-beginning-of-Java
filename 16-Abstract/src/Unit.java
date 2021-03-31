/** 육군/해군/공군의 공통 기능을 명시하기 위한 부모클래스 */
public abstract class Unit {
	private String name;

	public Unit(String name) {
		super();
		this.name = name;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 자식 클래스들이 재정의할 메서드를 추상으로 명시
	public abstract void attack();

	public abstract void move();

}