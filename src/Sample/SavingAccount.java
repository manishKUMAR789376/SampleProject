package Sample;



public class SavingAccount extends Account {
	
	
	
	
	public void calculateInterest() {
		
		//System.out.println("enter the interest percent value.");
		/*System.out.println("enter the p value");
		int p = sc.nextInt();
		System.out.println("enter the t value");
		int t=sc.nextInt();
		System.out.println("enter the r value");
		int r= sc.nextInt();*/
		//double value=sc.nextDouble();
		
		/*double ROT=balance*1*7/100;
		  balance = balance+ROT;
		System.out.println("interest "+ ROT);
		System.out.println("BALANCE + RATE OF INTEREST IS "+balance);*/
		Account a=new Account();
		a.deposit();
		a.withdraw();

		double ROT=a.balance*0.07;
		System.out.println("Rate of interest = "+ROT);
		a.balance=a.balance+ROT;
		System.out.println("total balance = "+a.balance);
		
		
		//System.out.println("balance"+(balance+interestRate));
		
		
	}
		
		
	}
	
	

