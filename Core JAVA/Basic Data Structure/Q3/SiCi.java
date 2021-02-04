package assignment.three;

public class SiCi {
	double principal,rate;
	int time;
	public SiCi(double principal,int time,double rate)
	{
		this.principal=principal;
		this.time=time;
		this.rate=rate;
		
	}

	public double simpleInterest(double principal,int time,double rate)
	{
		double si=(principal*time*rate)/100;
		return si;
	}
	 public double compoundInterest(double principal,int time,double rate)
	 {
		 double ci= (principal*Math.pow(1+rate/100,time)-principal);
		 return ci;
	 }
	 
}
