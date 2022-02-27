package assignment22;

import java.util.Scanner;

public class calculate_no_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = sc.nextInt();

	 int count =0;
	 while (n!=0) {
		 n=n/10;count++;}
		 System.out.println("no of digit :"+count);
		 
	 }
	 
	}


