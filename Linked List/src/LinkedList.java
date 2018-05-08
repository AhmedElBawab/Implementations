
public class LinkedList {

	ListNode head = null;
	public int flag = 1;

	public void print() {

		if (flag == 0) {
			System.out.print("ERROR");
		} else {
			ListNode i = head;

			while (i != null) {
				System.out.print(i.value);
				i = i.next;
			}
		}

	}

	public void add(char v, int index) {

		ListNode newNode = new ListNode();
		newNode.value = v;

		if (index < 0) {
			this.flag = 0;
		} else if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode i = head;
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
				if (i == null) {
					this.flag = 0;
					break;
				}
			}
			if (this.flag == 1) {
				newNode.next = i.next;
				i.next = newNode;
			}
		}

	}

	public void remove(int index) {

		ListNode i = head;
		ListNode j = i.next;
		if (index < 0) {
			this.flag = 0;
		} else if (index == 0) {
			head = head.next;
		} else {
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
				j = i.next;
				if (j == null) {
					this.flag = 0;
					break;
				}
			}
			if (this.flag == 1) {
				i.next = j.next;
			}
		}

	}

}
