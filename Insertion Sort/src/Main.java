
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		
		arr = insertionSort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		
	}
	
	public static int[] insertionSort(int arr[]) {
		int counter = 0 ;
		for(int i =0 ; i<arr.length-1 ;i ++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					counter++;
				}
			}
		}
		System.out.println(counter);
		
		return arr;
	}

}