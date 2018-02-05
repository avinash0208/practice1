package practice;
import java.util.ArrayList;
import java.util.Scanner;
public class sum {

		public static void main(String[] args) {
		   int number, sum,i,count=0;
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter a Number:");

		   number=input.nextInt();
		   for(i=1;i<number;i++) {
			   if(number%i==0)
				   count= count+i;
		   }
          if(count==number) {
        	  System.out.println("Success");
          }
          else System.out.println("Fail");
		 }
		
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        
}




