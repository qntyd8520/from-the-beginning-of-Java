// 배열 생성의 여러가지 방법과
// 배열에 포함된 값들에 대한 평균값 구하기
public class Main01 {

	public static void main(String[] args) {
		/** 배열의 생성 방법*/
		// 배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int [] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정의 일괄처리
		int [] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열 생성의 일괄처리
		int [] ddochy = new int[] {100, 100, 90};
		
		/** 배열의 활용 방법*/
		// 같은 종류의 변수들은 콤마로 구별하여 한번에 선언 가능
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		// 각 배열요소의 값에 대한 합계 구하기
		for (int i = 0; i < dooly.length; i++) {
			sum1 += dooly[i];
		}
		for (int i = 0; i < douneo.length; i++) {
			sum2 += douneo[i];
		}
		for (int i = 0; i < ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		
		// 배열의 전체 길이로 나누어, 평균을 출력한다
		System.out.println(sum1 / dooly.length);
		System.out.println(sum2 / douneo.length);
		System.out.println(sum3 / ddochy.length);
	}

}
