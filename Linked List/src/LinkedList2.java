
public class LinkedList2 {
	
	ListNode head =  null;
	ListNode head2 =  null;
	LinkedList f1 = null;
	LinkedList f2 = null;

	public void makeCopy(ListNode  head) {

      	ListNode i = head ;
	    ListNode j = head2;
        while (i != null){
        	ListNode newNode = new ListNode();
        	newNode.value = i.value;
        	j.next = newNode ;
        	i = i.next ;
        	j = j.next ;
       }
	}
	
	public void removeDuplicationIfSorted(){
		ListNode i = head ;
		ListNode j = i.next ;
		while(j != null){
			while(i == j){
				i.next = j.next;
			}
			i = j.next;
			j= j.next ;
		}
	}
	
	public void replaceFirtswithLast(){
		ListNode j = head ;
		while (j.next != null) {
			j = j.next;
		}
		ListNode newNode = new ListNode() ;
		newNode.value = head.value;
		head.value = j.value;
		j.value = newNode.value;
	}
	
	public void tetsOrder(){
		ListNode i = head ;
		int order = 1;
		while( i.next != null){
			if(i.value > i.next.value){
				System.out.println("NOT ORDERD");
				order = 0;
				break;
			}
			i = i.next ;
		}
		if(order == 1){
			System.out.println("ORDER");
		}
	}
	
	public ListNode getElement(char v){
		
		ListNode i = head ;
		while(i != null){
			if(i.value == v){
				return i ;
			}
			i = i.next;
		}
		return null ;
		
	}
	
	public ListNode getElement2(char v , ListNode i){
		
		if(i.value == v){
			return i ;
		}else if (i.next == null){
			return null;
		}else{
			return getElement2(v , i.next);
		}
		
	}
	
	/*public void testEquality(){
		int equal=1;
		if(f1.lenght != f2.leght){
			System.out.println("NOT EQUAL");
			equal = 0;
		}else{
			ListNode i = f1.head;
			ListNode j = f2.head;
			while(i!=null){
				if(i!=j){
					System.out.println("NOT EQUAL");
					equal = 0;
					break;
				}else{
					i = i.next;
					j=j.next;
				}
			}
		}
		if(equal == 1){
			System.out.println("EQUAL");
		}
		
	}*/
	
	
	public void Concatinate(){
		ListNode i = f1.head;
		ListNode j = f2.head;
		ListNode p1 = f1.head ;
		ListNode p2 = f2.head;
		while(i!=null && j!= null){
			i = p1 ;
			j = p2 ;
			p1 = p1.next;
			p2 = p2.next;
			i.next = j;
			j.next = p1;
		}
	}
	
	public void copy2(){
		f2.head = f1.head;
	}
	

}
