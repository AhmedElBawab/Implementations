
public class LinkedList {
	
	ListNode header = null;
	int size = 0;
	
	
	public void add(int index , int val){
		
		ListNode newNode = new ListNode();
		newNode.val = val;
		
		if(this.size < index){
			System.out.println("Cant't Add!!");
		}else if(index == 0){
			if(this.size==0){
				this.header=newNode;
				newNode.next = null;
			}else{
				newNode.next = this.header;
				this.header = newNode;
			}
			this.size++;
		}else{
			ListNode i = this.header;
			for(int j =0;j<index-1;j++){
				i = i.next;
			}
			
			newNode.next = i.next;
			i.next = newNode;
			this.size++;
		}
	}
	
	public void remove(int index){
		if(index == 0){
			this.header = this.header.next;
		}else{
			
		}
		
		
	}
	
	public void print(){
		if(this.size==0){
			System.out.println("The List Is Empty");
		}else{
			ListNode i = this.header;
			while(i.next!=null){
				System.out.print(i.val+" ");
				i = i.next;
			}
			System.out.println(i.val);
		}
	}
	
	public void isEmpty(){
		if(this.size==0){
			System.out.println("The List Is Empty");
		}else{
			System.out.println("The List Isn't Empty");
		}
	}

	public void getSize(){
		System.out.println("The size is : " + this.size);
	}

}
