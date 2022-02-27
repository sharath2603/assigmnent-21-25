package Assignment23feb;

import java.util.Scanner;

public class Nestedifeven_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = sc.nextInt();
		for (int i=1;i<=n;i++) 
			if ((n>0) &&(n<=10))
	if (n%2==0) {
		 	
		System.out.println("num is even :"+n);
		}
	else
	{System.out.println("num is not even :"+n);
		
	}
	}
}

