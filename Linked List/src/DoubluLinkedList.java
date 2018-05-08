
public class DoubluLinkedList {

	DoublyListNode head = null;
	DoublyListNode tail = null;

    public void InsertElementAtTail(char v){
    	   DoublyListNode newNode = new DoublyListNode();
		   newNode.value = v;
		   newNode.prev = tail;
           tail.next = newNode;
           newNode.next = null;
       }


    public void DeleteElementAtTail(){
             tail.prev = tail;
             tail.next = null;
       }

    public void InsertElementAtHead(char v ){
    	DoublyListNode newNode = new DoublyListNode();
		     newNode.value = v;
             newNode.next = head;
             head.prev =  newNode;
             head =  newNode;
    }

     public void DeleteElementAtHead(){
             head =  head.next;
             head.prev = null;
      }


}

