
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {12,21,3,67,8,19,1,0};//0,1,3,8,12,19,21,67
		int arr[] = {0,1,2,3,4,5,6,7};
		
		arr = bubbleSort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
	}
	
	public static int[] bubbleSort(int arr[]) {
		int counter = 0;
		for(int i = 0;i<arr.length;i++) {
			int flag = 0 ;
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					flag = 1;
					counter++;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		System.out.println("The turns is : "+counter);
		return arr;
	}

}
