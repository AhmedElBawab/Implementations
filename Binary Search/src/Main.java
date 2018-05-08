import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

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

			int result  = binary_search(0, arr.length - 1, arr, target);
			if (result == -1) {
				System.out.println("NOT FOUND");
			} else {
				System.out.println("IT IS FOUND AT INDEX : " + result);
			}
		}

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
