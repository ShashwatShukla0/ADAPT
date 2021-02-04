package assignment.five;

public class TaxAmount {
	int ctc;
	public TaxAmount(int ctc)
	{
		this.ctc=ctc;
	}
	int res;
	 public double calculateTaxAmount(int ctc)
	 {
		 if(ctc<180001)
		 {
			 res=0;
			 return res;
		 }
		 else
			 if(ctc<300001 && ctc>180000)
			 {
				 res=(ctc/100)*10;
				 return res;
			 }
		else
			if(ctc<500001 && ctc>300000)
			{
				 res=(ctc/100)*20;
				 return res;
			}
		else
		{
			res=(ctc/100)*30;
			 return res;
		}
	 }

}
