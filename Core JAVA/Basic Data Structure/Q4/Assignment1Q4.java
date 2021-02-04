package assignment.four;

import java.util.Scanner;

public class Assignment1Q4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double m1=sc.nextDouble();
		double m2=sc.nextDouble();
		double m3=sc.nextDouble();
		
		ResultDeclaration ar=new ResultDeclaration(m1,m2,m3);
		String res=ar.declareResults(m1,m2,m3);
		System.out.println(res);

	}

}
