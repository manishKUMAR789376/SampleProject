package Sample;

import java.util.Scanner;

public class Account {
	
	
	/*public Account() {
		balance=0;
	}
	public Account(double amount) {
		balance = initialBalance;
		
	}
	public void deposit(double amount) {
		balance= balance+amount;
	}
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	public double getBalance() {
		return balance;
	}*/
	
	Scanner sc=new Scanner(System.in);
	
	 double balance=0;
	
	public void deposit() {
		System.out.println("enter the deposit amount :");
		int amount=sc.nextInt();
		balance=balance+amount;
		
		System.out.println("balance amount = "+balance);
		
	}
	public void withdraw() {
		System.out.println("enter the withdram amount :");
		int amount=sc.nextInt();
	//	balance=balance-amount;
		//System.out.println(balance);
	
		if(amount>50000) {
			 balance=(balance-amount)-(((balance-amount)/1000)*5);
			 
			System.out.println(
					balance);
		}
		else {
			balance=balance-amount;
			System.out.println("After withdraw remaing Amount = "+balance);
		}
	
	}
	
  
	/*public  double getBalance() {
		/*double ROT=balance*0.07;
		System.out.println(ROT);
		balance=balance+ROT;
		System.out.println(balance);*/
		//return balance;*/
		
	}

