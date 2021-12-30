package rough;

public abstract class Insurance implements Print {

	int PolicyNumber;
	double MonthlyPremium;

	public Insurance(int n,double b)
	{
	n = PolicyNumber;
	b = MonthlyPremium;
	}
	public int getPolicyNumber()
	{
	return PolicyNumber;
	}
	public double getMonthlyPremium()
	{
	return MonthlyPremium;
	}
	public double getAnnualPremium()
	{
	return MonthlyPremium;
	}
	public void setPolicyNumber(int n)
	{
	PolicyNumber = n;
	}
	public void setAnnualPremium(double b)
	{
	MonthlyPremium = b;
	}
	public abstract void setMonthlyPremium(double r);

	}
