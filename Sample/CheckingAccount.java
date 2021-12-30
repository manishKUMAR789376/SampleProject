package Sample;
import java.util.Scanner;
public class CheckingAccount extends Account {
	
	//public void deductFee() {
		
		
		
		/*int limit=1000000;
		int f = 0;
		
		if(limit<50000) {
			System.out.println("no fee below 50000");
		}
		else if(limit >50000){
			f=limit*5/1000;
			 
			System.out.println(limit-f);
		}
		else {
			System.out.println(limit);
			
		
		}	
		// super.withdraw();
		  double balance =  super.getBalance();
		System.out.println(balance);  */
	
	public static void main(String[] args) {
		//Account a=new Account();
	     
		//a.deposit();
		//a.withdraw();
	
		SavingAccount sa= new SavingAccount();
		sa.calculateInterest();	
       // CheckingAccount ca= new CheckingAccount();
		
		//ca.deductFee();
		
	}
	}
	

