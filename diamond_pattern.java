package Assignment24feb;

import java.util.Scanner;

public class diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = scan.nextInt();

	int sp =n/2;
	int str =1;
	
	for(int i=1;i<=n;i++) {
		
		for (int j=1;j<=sp;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=str;j++) {
			System.out.print("*");
		}
	if (i<=n/2) {
		sp--;
		str+=2;
		
		
	}else {
		sp++;
		str-=2;
		
		
	}
	System.out.println();
	}
	}

	
	}


