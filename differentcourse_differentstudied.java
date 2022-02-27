package Assignment23feb;

import java.util.Scanner;

public class differentcourse_differentstudied {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner scan = new Scanner(System.in);
		System.out.println("enter the branch:");
		String branch = scan.nextLine();

		System.out.println("enter the year:");
		int year = scan.nextInt();
		
		
switch (year) {
case 1:
	
	System.out.println("all subjects");

break;

case 2:
case 3:
case 4:
	
	switch (branch) {
	case "IT":
	case "CSE":
		System.out.println("you opt computer branch");
		break ;
	case "EE":
	case "ECE":
		System.out.println("you opt electrical branch");
	break;
	case "mechanical":
		System.out.println("you opt mechanical branch");
	break ;
	default :
		System.out.println("invalid input");
	break ;

	}
}
	 
	 
	 
	}

}
