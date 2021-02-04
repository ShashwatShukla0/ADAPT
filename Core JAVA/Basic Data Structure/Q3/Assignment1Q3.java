package assignment.three;

import java.util.Scanner;

public class Assignment1Q3 {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		double principal=sc.nextDouble();
		int time=sc.nextInt();
		double rate=sc.nextDouble();
		
		SiCi ar= new SiCi(principal,time,rate);
		double res1=ar.simpleInterest(principal,time,rate);
		double res2=ar.compoundInterest(principal,time,rate);
		System.out.println("Simple Interest: "+res1);
		System.out.println("Coumpound Interest: "+res2);

	}

}
