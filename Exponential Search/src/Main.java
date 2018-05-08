import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// int target = 377;
		// int[] arr = { 0, 1, 2, 3, 4, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
		// 610 };

		System.out.println("Please Enter Array Size:");
		int no_of_elements = input.nextInt();

		System.out.println("Please Enter Array Elements:");
		int[] arr = new int[no_of_elements];
		for (int i = 0; i < no_of_elements; i++) {
			arr[i] = input.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Please Enter Number Of tries:");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Please Enter The Target:");
			int target = input.nextInt();

			int result = exponential_search(arr, target);
			if (result == -1) {
				System.out.println("NOT FOUND");
			} else {
				System.out.println("IT IS FOUND AT INDEX : " + result);
			}
		}
	}

	public static int exponential_search(int[] arr, int target) {
		int i = 1;
		if (arr[0] == target) {
			return 0;
		}
		if (arr[arr.length - 1] < target) {
			return -1;
		}
		while (arr[i] < target) {
			i = i * 2;
			if (i > arr.length - 1) {
				i = arr.length - 1;
				break;
			}
		}
		return binary_search(i / 2, i, arr, target);
	}

	public static int binary_search(int left, int right, int[] arr, int target) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[left] == target) {
				return left;
			}
			if (arr[right] == target) {
				return right;
			}
			if (arr[mid] > target) {
				return binary_search(left, mid - 1, arr, target);
			}
			if (arr[mid] < target) {
				return binary_search(mid + 1, right, arr, target);
			}
		}
		return -1;
	}

}
