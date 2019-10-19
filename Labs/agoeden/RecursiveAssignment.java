package agoeden;

public class RecursiveAssignment {

	public static void orderMatters(String input) {
		if (input.length() > 1) {
			System.out.print(input.substring(0, 1));
			orderMatters(input.substring(1));
		} else {
			System.out.println(input);
			return;
		}
	}

	public static void orderMattersReverse(String input) {
		int len = input.length();
		if (len > 1) {
			System.out.print(input.substring(len - 1));
			orderMattersReverse(input.substring(0, len - 1));
		} else {
			System.out.println(input);
			return;
		}
	}

	public static int sumOfSums(int[] arr) {
		if (arr.length > 1) {
			int sum = 0;
			for (int var : arr) {
				sum += var;
			}
			int[] newArr = new int[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				newArr[i - 1] = arr[i];
			}
			return sumOfSums(newArr) + sum;
		} else {
			return arr[0];
		}
	}

	public static void main(String[] args) {
		orderMatters("Hello world!");
		orderMattersReverse("Hello world!");
		int[] arr = new int[] { 50, 19, 1, -49, 3, 99, 3, 21, 63 };
		System.out.print(sumOfSums(arr));
	}
}
