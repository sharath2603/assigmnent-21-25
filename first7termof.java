package Homework_feb21;

import java.util.Scanner;

public class first7termof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
     int n = scan.nextInt();
	
	for (int i=1;i<=n;i++) {
		int sum= n*6*n;
		if(n%7==0) {
			
			System.out.println("divisible by 7:"+sum);
		}
	}
		
	}

}
