package Assignment24feb;

import java.util.Scanner;

public class Left_traingle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = scan.nextInt();

	 
	 for (int i=1;i<=n;i++) {
		 for (int j=1;j<=i;j++) {
			 
			 System.out.print("*");
			 
		 }
	  System.out.println();
	 }
	}

}
