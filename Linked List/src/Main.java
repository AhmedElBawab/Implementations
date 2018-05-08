
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();

		l.add('a', 0);// a
		l.add('b', 1);// ab
		l.add('c', 2);// abc
		l.add('d', 3);// abcd
		l.add('e', 4);// abcde
		l.add('f', 5);// abcdef
		l.add('g', 2);// abgcdef
		l.add('h', 0);// habgcdef
		l.add('s', 8);// habgcdefs
		// l.add('z',10);//habgcdefs-z
		// l.add('z',-1);//z-habgcdefs
		l.remove(4);//habgdefs
		l.remove(2);//hagdefs
		l.remove(6);//hagdef
		l.remove(0);//agdef
		//l.remove(-10);
		//l.remove(12);
		//System.out.println(l.getElement('g'));
		//l.replaceFirtswithLast();

		l.print();

	}

}
