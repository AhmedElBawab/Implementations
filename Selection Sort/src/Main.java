
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,21,3,67,8,19,1,0};//0,1,3,8,12,19,21,67
		
		arr = selectionSort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		
	}
	
	
	public static int[] selectionSort(int[] arr) {
		for(int i = 0 ;i <arr.length;i++) {
			int min = i;
			for(int j = i ;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
