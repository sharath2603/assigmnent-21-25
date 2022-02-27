package Assignment24feb;

import java.util.Scanner;

public class pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = scan.nextInt();

	 
	 for (int i=1;i<=n;i++) {
		 for (int j=n-1;j>=i;j--) {
			 System.out.print(" ");
			 
		 }for (int k=1;k<=i;k++) {
			 System.out.print("* ");
		 }
	 System.out.println();
	 }
	}
}

