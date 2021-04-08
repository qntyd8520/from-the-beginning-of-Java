// Java 형성평가 (2) 1번문제

package test02;

public class test01 {

	public static void main(String[] args) {
		/** 변수 준비 */
		// 자신의 키
		double myHeight = 171D;
		// 자신의 몸무게
		double myWeight = 89D;
		// 표준체중
		double standardWeight = 0D;
		// 비만도
		double obesity = 0D;

		/** 표준체중 standardWeight 구하기 */
		if (myHeight <= 150) {
			standardWeight = myHeight - 110;
		} else {
			standardWeight = (myHeight - 110) * 0.9;
		}

		/** 비만도 값 obesity를 구하기 */
		double x = myWeight - standardWeight;
		obesity = (x / standardWeight) * 100;

		/** 범위에따라 비만도 측정치를 if문을 사용해서 출력 */
		if (obesity <= 20) {
			System.out.println("정상 안심입니다.");
		} else if (obesity <= 30) {
			System.out.println("경도비만 주의가필요합니다.");
		} else if (obesity <= 50) {
			System.out.println("중등도 비만 위험합니다.");
		} else {
			System.out.println("고도비만!! 매우 위험합니다.");
		}

	}

}
