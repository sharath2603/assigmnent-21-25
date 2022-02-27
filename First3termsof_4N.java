package Homework_feb21;

import java.util.Scanner;

public class First3termsof_4N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
     int n = scan.nextInt();
	
	for (int i= 1;i<=n;i++) 
		{
		int sum =4*n+9;
		if (n%3==0) {
		
			System.out.println(sum);
		}
			
		}
	}
	
	
	}


