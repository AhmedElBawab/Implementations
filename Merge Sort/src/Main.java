
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,7,1,2,3,6,0,8};
		
		mergeSort(arr , 0 , arr.length-1);
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		
		
	}
	
	public static void mergeSort(int[] arr , int start , int end) {
		if(start!=end) {
			int mid = (end-start)/2 + start;
			mergeSort(arr , start , mid);
			mergeSort(arr , mid+1 , end);
			merge(arr,start ,end , mid);
		}
	}
	
	public static void merge(int[] arr ,int l ,int  r ,int mid) {
		
		int k = l ;
		int[] leftArr = new int[mid-l+1];
		for(int i = 0 ; i<leftArr.length ; i++) {
			leftArr[i] = arr[k];
			k++;
		}
		int [] rightArr = new int[r-mid];
		for(int i = 0 ; i<rightArr.length ; i++) {
			rightArr[i] = arr[k];
			k++;
		}
		k = l ;
		int left = 0;
		int right = 0;
		
		while(left<leftArr.length && right<rightArr.length) {
			if(leftArr[left]<rightArr[right]) {
				arr[k] = leftArr[left];
				left++;
				k++;
			}else {
				arr[k] = rightArr[right];
				right++;
				k++;
			}
		}
		while(left<leftArr.length) {
			arr[k] = leftArr[left];
			left++;
			k++;
		}
		while(right<rightArr.length) {
			arr[k] = rightArr[right];
			right++;
			k++;
		}
	}

}
