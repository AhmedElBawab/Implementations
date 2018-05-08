import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter The Array Size:");
		int no_of_elements = input.nextInt();

		System.out.println("Please Enter The Array Elements:");
		int[] arr = new int[no_of_elements];
		for (int i = 0; i < no_of_elements; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Please Enter The Target:");
		int target = input.nextInt();

		int result = ternary_search(arr, 0, arr.length - 1, target);
		if (result == -1) {
			System.out.println("NOT FOUND");
		} else {
			System.out.println("FOUND AT INDEX :" + result);
		}
	}

	public static int ternary_search(int arr[], int left, int right, int target) {
		if (left <= right) {
			int h = (right - left) / 3 + left;
			int l = 2 * (right - left) / 3 + left;

			if (arr[h] == target) {
				return h;
			}
			if (arr[l] == target) {
				return l;
			}
			if (arr[left] == target) {
				return left;
			}
			if (arr[right] == target) {
				return right;
			}
			if (arr[h] < target) {
				return ternary_search(arr, h + 1, right, target);
			}
			if (arr[h] > target) {
				return ternary_search(arr, left, l - 1, target);
			}
		}
		return -1;
	}
}
