package assignment.six;

import java.util.Scanner;

public class Assignment1Q6 {
	static int count  = 1;
	public static String doAgain() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter userId ");
	String UserId = sc.nextLine();
	System.out.println("Enter password ");
	String pass = sc.nextLine();
	Login login = new Login();
	String str = login.loginUser(UserId, pass);
	count++;
	   return  str;
	}

	public static void main(String[] args) {
		String str = doAgain();
		System.out.println(str);
		

	}

}
