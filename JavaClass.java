package Practice1;

import java.util.Scanner;

public class JavaClass {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int myNumber=(int)(Math.random()*100);
		 int usernumber;
		 
		 do {
			 System.out.println("guess my number=");
			 usernumber=sc.nextInt();
			 
			 if(usernumber == myNumber) {
				 System.out.println("right number");
				 break;
			 }
			 else if(usernumber> myNumber) {
				 System.out.println("your number is to large");
				 
			 }
			 else {
				 System.out.println("your number is too small");
				 
			 }
			
			 
		 } while(usernumber>=0);
		 
		 System.out.print("my number was=");
		System.out.println(myNumber);
		
		
	}

}
