package assignment.three;

class Fixed {
	public int getCash(int amt)
	{
		amt=0;
		return amt;
	}
}

class CurrentAccount extends Fixed {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash(int amt) {
    	amt= totalDeposits-creditLimit;
    	return amt;
    }
}
class SavingsAccount extends Fixed {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int amt) {
    	amt= totalDeposits-fixedDepositAmount;
    	return amt;
    }
}

public class Assignment2Q3 {

	public static void main(String[] args) {
		
		CurrentAccount c1= new CurrentAccount();
		SavingsAccount s1= new SavingsAccount();
		System.out.print("Amount Withdrawn: Rs."+(c1.getCash(2000)+s1.getCash(5000)));

	}

}
