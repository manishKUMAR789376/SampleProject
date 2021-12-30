package exceptions;

import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
		try {
			throw new Account("amount");
		}
		catch(Exception e) {
			for(int chance=3;chance>=1;chance++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter balance");
				int bal=sc.nextInt();
				System.out.println("enter withraw");
				int amount=sc.nextInt();
				
				
				if(amount>bal) {
					for(int chance1=3;chance1>=1;chance1++) 
					{
						if (chance==1) 
						{
							System.out.println(bal-amount);
							System.out.println("last");
							break;
						}
						else {
							System.out.println("insufficient balance");
							System.out.println("you have "+(chance-1)+"attempt");
							amount=sc.nextInt();
						}
				    }
					
				
					System.out.println(bal-amount);
					}
					
					System.out.println("no");
					
				}
			}
		}
	}


