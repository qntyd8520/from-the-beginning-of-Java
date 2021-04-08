// JAVA 형성평가 (3) 6번문제

package test03;

public class test06 {

	public static void main(String[] args) {
		// 일한 시간
		int[] worktime = { 7, 5, 5, 5, 5, 10, 7 };
		// 총급여
		int pay = 0;

		for (int i = 0; i < worktime.length; i++) {
			if (i <= 3) {
				pay += worktime[i] * 4500;
			} else {
				pay += worktime[i] * 5200;
			}
		}
		System.out.println("일주일 간의 총 급여 : " + pay + "원");
	}

}
