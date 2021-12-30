package exceptions;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		
	System.out.println("enter the intial balance");
 Scanner sc = new Scanner(System.in);
 
  double intialBalance=sc.nextInt();
  System.out.println("enter the withdraw Amount");
  double withdraw=sc.nextDouble();
  for(int chance=4;chance>=1;chance++) {
	  try {
		  
		  System.out.println(intialBalance-withdraw);
		  System.out.println("transactions was successfully ");
		  
		  
	  }
	  catch(Exception e) {
		  if(chance==1) {
			  System.out.println("last attempt is failed,transaction is unsuccessfully");
			  break;
		  }
		  else {
			  System.out.println("insufficient balance");
			 /* System.out.println("you have "+(chance-1)+"attempts left");
			  System.out.println();
			  break;*/
			  
		  }
	  
	  }
	  
  }
  
  
 
}
}
