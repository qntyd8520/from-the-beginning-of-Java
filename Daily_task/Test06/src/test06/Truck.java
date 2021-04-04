package test06;

public class Truck extends Car {
	public Truck(int speed) { super(speed);}
	
	@Override 
	public void speedUp() {
		int speed = this.getSpeed();
		speed += 5;
		this.setSpeed(speed);
	}
	
}
