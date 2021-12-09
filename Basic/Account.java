package Basic;
//manishkumar
public class Account {
	String accountHolder;
	int accountNo;
	String branch;
	String ifsc_Code;
	
	public Account(String accountHolder,int accountNo,String branch,String ifsc_Code)
	{
		this.accountHolder=accountHolder;
		this.accountNo=accountNo;
		this.branch=branch;
		this.ifsc_Code=ifsc_Code;
	}
	public void savingAccount()
	{
	System.out.println("name of the holder :"+accountHolder);
	System.out.println("Account no:"+accountNo);
	System.out.println("branch name :"+branch);
	System.out.println("ifsc code :"+ifsc_Code);
	

	}
	
	

}
