package assignment.one;

import java.util.Scanner;

public class ArmstrongOrNot {
	int n;
	public ArmstrongOrNot(int n) {
		this.n=n;
	}
	
	public int arm() {
		int real,rem,res=0;
		
		real=n;
		while(real!=0)
		{
			rem= real%10;
			res+= Math.pow(rem, 3);
			real /= 10;
		}
		
		return res;
	}
	

	

}
