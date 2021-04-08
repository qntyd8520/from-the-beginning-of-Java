package test06;

public class test01 {

	public static void main(String[] args) {
		Car sport = new SportCar(0);
		Car truck = new Truck(40);
		
		int scar_speed = sport.getSpeed();
		int truck_speed = truck.getSpeed();
		int second = 0;
		
		// 트럭의 속도가 스포츠카의 속도보다 작은 동안 반복한다.
		while(truck_speed > scar_speed) {
			// 반복문 1회당 1초씩 증가한다고 가정.
			second++;
			
			// 스포츠카는 초당 10km씩 증가
			sport.speedUp();
			
			// 트럭은 초당 5km씩 증가
			truck.speedUp();
			
			// 증가된 속도를 비교식에 활용하기 위하여 조회한다.
			scar_speed = sport.getSpeed();
			truck_speed = truck.getSpeed();
		}
		System.out.printf("스포츠카가 트럭보다 빨라지는데 걸리는 시간은" + 
		"%d초이고 시속 %dkm 입니다.", second, sport.getSpeed());
	}

}
