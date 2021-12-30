package rough;
import java.text.DecimalFormat;
public class AutoInsurance extends Insurance
{
	private String VIN;
	private double AnnualPremium;
	public AutoInsurance(int n, double b, double i, String vin) 
	{
		super(n, b);
		VIN = vin;
		AnnualPremium = i;
	}
	public void setAnnualPremium(double i)
    {
        i = AnnualPremium;
    }
    public double getAnnualPremium()
    {
        return AnnualPremium;
    }
	public void setVIN(String vin)
    {
        VIN = vin;
    }
    public String getVIN()
    {
        return VIN;
    }

	public void setMonthlyPremium(double r) 
	{
		MonthlyPremium = r;	
	}

	public void print() 
	{
		DecimalFormat dollar = new DecimalFormat("#,###.00");
		System.out.println("Auto \nPolicy number is "+  getPolicyNumber()
                        +"\nMonthly Premium is $"+  dollar.format(getMonthlyPremium())
                        +"\nAnnual Premium is $"+ dollar.format(getAnnualPremium())
                        + "\nVIN: "+ getVIN());	
		
	}
	
}


