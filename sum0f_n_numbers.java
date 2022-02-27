package assignment22;

import java.util.Scanner;

public class sum0f_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
	 int n = sc.nextInt();
	int sum = 0	,i=1;
	
while(i<=n) {
	
	sum =sum+i;
	i++;
}System.out.println(sum);
		
	}
}

