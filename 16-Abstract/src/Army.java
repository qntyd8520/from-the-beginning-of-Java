/** 
 * 추상 클래스를 상속받으면 자식은 부모의 모든 추상 메서드를
 * 재정의 해야한다
 */
public class Army extends Unit {

	public Army(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " >> 육상공격");
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " >> 육상이동");
	}
	

}
