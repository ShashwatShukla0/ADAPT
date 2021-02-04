package assignment.five;

import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int ctc=sc.nextInt();
		
		TaxAmount ar= new TaxAmount(ctc);
		double total=ar.calculateTaxAmount(ctc);
		System.out.println(total);

	}

}
