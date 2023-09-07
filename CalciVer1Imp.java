package Chapter23TaskWithInterface;

public class CalciVer1Imp extends basicCalciImp implements CalciVer1 {
	
	public double power(double a,double b)
	{
		double res=1;
		for(int i=1;i<=b;i++)
		{
			res=res*a;
		}
		return res;
	}
	

}
