
public class LinkedList {
	
	public Node header = new Node();
	public int size = 0;
	
	
	public void addLast(int value){
		Node newNode = new Node();
		newNode.value = value;
		
		Node i = new Node();
		i = header;
		while(i.next != null){
			i = i.next;
		}
		i.next = newNode;
		this.size++;
	}
	
	
	public void removeLast(){
		Node i = new Node();
		i = header;
		Node f = i.next;
		while(f.next != null){
			i = i.next;
			f= i.next;
		}
		i.next = null;
		this.size--;
	}
	
	
	public void addAtIndex(int value , int index){
		if()
	}
	
	
	public void print(){
		if(this.size == 0){
			System.out.println("The Linked List Is Empty!!");
		}else{
			Node i = new Node();
			i = header;
			while(i.next != null){
				i =i.next;
				System.out.print(i.value);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	
	public int get_size(){
		return size;
	}
	
	
	public boolean isEmpty(){
		if(this.size == 0){
			return true;
		}else{
			return false;
		}
	}

}
