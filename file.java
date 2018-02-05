package practice;
import java.io.*;

public class file {
	
	public static void main(String[] args) throws Exception {
		
		  file f=new file();
		  
		  System.out.println("Writing");
		  f.write();
		  
		  System.out.println("Reading");
		  f.read();
		  
	}
	
  void read() throws Exception{
	 
    String line= null;
	BufferedReader br = new BufferedReader(new FileReader("/home/avinash/a.txt"));
	
    while((line = br.readLine()) != null) {
          System.out.println(line);
    }   
    br.close();  
}
 
 void write() throws Exception {
   
	 BufferedWriter bw= new BufferedWriter( new FileWriter("/home/avinash/a.txt"));
     bw.write("Hello bro\n");
     bw.write("avinash gupta\n");
     //bw.nextLine();
     bw.close();
 }
}
