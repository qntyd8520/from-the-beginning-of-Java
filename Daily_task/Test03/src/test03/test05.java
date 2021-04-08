// JAVA 형성평가 (3) 5번문제

package test03;

public class test05 {

	public static void main(String[] args) {
		boolean[] checkList = { true, false, false, true, false };

		System.out.println("-------before---------");
		printArray(checkList);

		for (int i = 0; i < checkList.length; i++) {
			checkList[i] = !checkList[i];
		}

		System.out.println("-------after----------");
		printArray(checkList);
	}

	public static void printArray(boolean[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

			if (i + 1 < data.length) {
				System.out.print(", ");
			}
		}

		System.out.println();
	}

}
