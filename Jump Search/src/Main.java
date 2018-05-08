import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Array Size:");
		int arr_size = input.nextInt();
		//int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
		//16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		
		System.out.println("Please Enter Array Elements:");
		int[] arr = new int[arr_size];
		for(int i =0 ;i<arr_size;i++){
			arr[i] = input.nextInt();
		}
		
		System.out.println("Please Enter The Target:");
		int target = input.nextInt();
		System.out.println("Please Enter The Step:");
		int step = input.nextInt();
		
		if(jump_search(arr , target , step)==-1){
			System.out.println("NOT FOUND");
		}else{
			System.out.println("FOUND AT INDEX : "+ jump_search(arr , target , step));
		}
	}

	public static int jump_search(int[] arr , int target , int step) {
		int start = 0 ; 
		int end = start + step ;
		while(target > arr[end] && end < arr.length){
			start = end ;
			end = end + step ;
			if(end > arr.length){
				end = arr.length-1;
				break;
			}
		}
		for(int i = start ; i<=end ; i++){
			if(arr[i] == target){
				return i ;
			}
		}
		return -1;
	}
}
