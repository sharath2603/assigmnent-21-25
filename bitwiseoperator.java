package Homework_feb21;

import java.util.Scanner;

public class bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
     int a = scan.nextInt();
     int b = scan.nextInt();
     
     System.out.println("a&b:"+(a&b));
     System.out.println("a|b:"+(a|b));
     System.out.println("a^b:"+(a^b));
		
	}

}
