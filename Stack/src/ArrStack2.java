
public class ArrStack2 extends ArrStack {

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
