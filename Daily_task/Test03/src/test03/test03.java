// JAVA 형성평가 (3) 3번문제

package test03;

public class test03 {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };
		printArry(arr);
	}

	public static void printArry(int[] arr) {
		int j = -1;
		for (int i = arr.length - 1; 0 <= i; i--) {
			j += 1;
			System.out.println("arr[" + j + "] = " + arr[i]);
		}

	}
}
