package assignment.four;

public class ResultDeclaration {
	double m1,m2,m3;
	public ResultDeclaration(double m1,double m2,double m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public String declareResults( double m1, double m2, double m3)
	{
		 if(m1>60 && m2>60 && m3>60)
		 {
			 return "Passed";
		 }
		 else
			 if((m1>60 && m2>60) || (m2>60 && m3>60) || (m3>60 && m1>60))
			 {
				return "Passed   Promoted";
			 }
		else
		{
			return "Failed";
		}
	}

}
