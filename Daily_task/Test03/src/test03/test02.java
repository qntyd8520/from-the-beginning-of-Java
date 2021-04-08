// Java 형성평가 (3) 2번문제

package test03;

public class test02 {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };

		int[] copy = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
			System.out.println("copy[" + i + "] = " + copy[i]);
		}

	}

}