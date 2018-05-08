
public class ArrStack {
	
	public int arr[] = new int[10];
	public int index = -1;
	
	public void push(int x){
		if(this.index == 9){
			System.out.println("CAN'T PUSH");
		}else{
			this.index++;
			this.arr[index] = x;
		}
	}
	
	public int pop(){
		if(index == -1){
			System.out.println("CAN'T POP");
			return 0;
		}else{
			int x = this.arr[index];
			this.index--;
			return x;
		}
	}
	
	public int getSize(int[] arr){
		ArrStack newStack = new ArrStack();
		int counter =0;
		while(true){
			try{
				newStack.push(this.pop());
				counter++;
			}catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}
		for(int i =0 ; i<counter;i++){
			this.push(newStack.pop());
		}
		return counter;
	}
}
