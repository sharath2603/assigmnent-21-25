package Homework_feb21;

import java.util.Scanner;

public class numdivisibleby2_8notwith12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num:");
     int n = scan.nextInt();
	
    boolean res= ((n%2==0)&& (n%8==0)&&(n%12!=0))? true :false;
    		{
    	 System.out.println(res);
     } 
}
}