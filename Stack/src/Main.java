
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrStack l = new ArrStack();
		
		//l.pop();
		/*l.push(5);//5
		l.push(6);//56
		l.push(2);//562
		l.push(1);//5621
		l.push(5);//5
		l.push(6);//56
		l.push(2);//562
		l.push(1);//5621
		l.push(5);//5
		l.push(6);//56
		l.push(2);//562
		l.push(1);//5621*/
		
		l.push(5);//5
		l.push(6);//56
		l.push(2);//562
		l.push(1);//5621
		
		System.out.println(l.pop());//562
		System.out.println(l.pop());//56
		
		l.push(8);//568
		l.push(10);//56810
		
		System.out.println(l.pop());//568
		
	}

}
