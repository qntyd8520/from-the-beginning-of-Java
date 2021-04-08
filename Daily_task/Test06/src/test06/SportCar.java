package test06;

public class SportCar extends Car{
	public SportCar(int speed) { super(speed);}
	

	@Override
	public void speedUp() {
		int speed = this.getSpeed();
		speed += 10;
		this.setSpeed(speed);
	}
}
