
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList m = new LinkedList();
		m.addLast(1);//1
		m.addLast(2);//12
		m.addLast(3);//123
		m.addLast(4);//1234
		m.addLast(5);//12345
		m.removeLast();//1234
		m.print();
		m.addLast(6);//12346
		m.addLast(7);//123467
		m.print();
		m.removeLast();//12346
		m.removeLast();//1234
		m.print();
		
		System.out.println(m.get_size());
		m.print();
	}

}
