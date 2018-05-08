import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public int n;
	public int m;
	public char my[] = new char[n] ;
	public String[] map ;
	public String[] dic ;
	
	public void readFile(String filepath) throws FileNotFoundException{		
		File file = new File(filepath);
	    Scanner x = new Scanner(file);
	    this.n = x.nextInt();
	    this.m = x.nextInt();
	    int i = 1;
	    map = new String [n];
	    map[0] = x.next();
	    while (x.hasNextLine()) {
            String line = x.nextLine();
            map[i].valueOf(line);
            i++;
        }
	    x.close();
	}
	
	
	  public String[] readfromfile(String filePath) throws IOException{
	  
	  int bufferSize = 8 * 1024;
	  
	  BufferedReader bufferedReader = new BufferedReader( new
	  FileReader(filePath), bufferSize);
	  
	  String line = bufferedReader.readLine();
	  
	  this.n =  line.charAt(0)-48;
	  this.m = line.charAt(2)-48;
	  
	  line = bufferedReader.readLine();
	 
	  int counter=0;
	  dic = new String[n];
	  
	  while(line != null) { 
		  dic[counter]=line;
		  System.out.println(dic[counter]);
		  counter++; 
		  line = bufferedReader.readLine();
		  }
	  return dic; 
	  }
	 
}
	
	
