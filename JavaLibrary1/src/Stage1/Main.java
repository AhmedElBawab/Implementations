package Stage1;

import java.applet.Applet;
import java.util.Scanner;

public class Main extends Applet {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome To Our Application:-");
		
		System.out.println("Choose Your Option:-");
		System.out.println("1-Choose From File.");
		System.out.println("2-Enter By Console");
		
		
		
		
		int x = s.nextInt();
		
		
		String minterms = "";
		String dontCares = "";

		
		if(x == 2){
		System.out.println("Enter the minterms:");
		minterms = s.next();
		
		
		System.out.println("Enter the don't cares: (Enter -1 if there is no don't cares)");
		dontCares = s.next();
		if(dontCares.equals("-1")){
			dontCares = null;
		}
		
		
		Answer a = new Answer(minterms,dontCares);
		
		
		System.out.println(a.Step1());
		
		System.out.println("\n");
		
		System.out.println(a.Step2());
		
		System.out.println("\n");
		
		System.out.println(a.Step3());
		
		System.out.println("\n");
		
		System.out.println(a.Step4());
		
		System.out.println("\n");
		
		System.out.println(a.Step5());
		
		System.out.println("\n");
		
		System.out.println(a.Step6());
		
		System.out.println("\n");
		
		System.out.println(a.Step7());
		
		System.out.println("\n");
		
		System.out.println(a.Solution());
		

		
		}
		else if(x==1){
			ReadFile r = new ReadFile("D://Tabular.txt");
			
			System.out.println(r.Step1());
			
			System.out.println("\n");
			
			System.out.println(r.Step2());
			
			System.out.println("\n");
			
			System.out.println(r.Step3());
			
			System.out.println("\n");
			
			System.out.println(r.Step4());
			
			System.out.println("\n");
			
			System.out.println(r.Step5());
			
			System.out.println("\n");
			
			System.out.println(r.Step6());
			
			System.out.println("\n");
			
			System.out.println(r.Step7());
			
			System.out.println("\n");
			
			System.out.println(r.Solution());
		}
		
	
	}

}
