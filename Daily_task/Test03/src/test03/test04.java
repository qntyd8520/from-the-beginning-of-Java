// JAVA 형성평가 (3) 4번문제

package test03;

public class test04 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 9, 4, 2, 5 };
		int[] arr2 = { 5, 8, 6, 3, 1 };

		System.out.println("일치하는 데이터는 총 " + compareArray(arr1, arr2) + "개입니다.");
	}

	public static int compareArray(int[] arr1, int[] arr2) {
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count += 1;
				} else {
					count += 0;
				}
			}
		}
		return count;

	}
}
