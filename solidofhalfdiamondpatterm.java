package Assignment25feb;

import java.util.Scanner;

public class solidofhalfdiamondpatterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = sc.nextInt();
	 for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
		
			System.out.print("*  ");
			
			}System.out.println(" ");
		}
		
	
	for (int i=0;i<=n;i++) {
		for (int j=i;j<=n;j++) {
			System.out.print("*  ");
			
		}System.out.println(" ");
	}System.out.println();
	}
	}
