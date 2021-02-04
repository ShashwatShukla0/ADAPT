package assignment.one;

import java.util.Scanner;

public class Assignment1Q1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    ArmstrongOrNot ar = new ArmstrongOrNot(n);
		int res=ar.arm();
	    
		if(res==n)
		{
			System.out.println(n +" is a Armstrong number");
		}
		else
		{
			System.out.println(n +" is not a Armstrong number");
		}

	}

}
