
public class stack {

	ListNode header = null;
	public int size = 0;
	
	public void add(){
		
	}
	
	public void remove(){
		
	}
	
	public void print(){
		if(this.size == 0){
			System.out.print("The Stack Is Empty");
		}else{
			ListNode i = this.header;
			while(i.next!=null){
				System.out.print(i.val);
				i = i.next;
			}
			System.out.print(i.val);
		}
	}
	
	public void getSize(){
		System.out.println(this.size);
	}
}
