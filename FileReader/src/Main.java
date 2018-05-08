import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		ReadFile l = new ReadFile();
		//l.readFile("C:\\Users\\ahmed\\Desktop\\New Text Document.txt");
		l.readfromfile("C:\\Users\\ahmed\\Desktop\\New Text Document.txt");
		System.out.println(l.n);
		System.out.println(l.m);
		
    }

}
