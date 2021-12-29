package Assignment;


import java.util.Random;
import java.util.Scanner;



public class RandomNumbers {
	int min=50;
	int max=150;
	int x;
	int num;                                   //Assignment =6
	
   Scanner sc =new Scanner(System.in);
   public void find() {
	Random random=new Random();
	x=50+random.nextInt(150);
			
	System.out.println();
	for(int i=1;i<=7;i++) {
		System.out.println("enter the random number");
		num=sc.nextInt();
		if(num<x) {
			System.out.println("TO LOW");
		}
		else if(num >x) {
			System.out.println("TO HIGH");
		}
		else if(num ==x) {
			System.out.println("YOU WIN");
		}
		else  
		System.out.println("invalid number");
		
	    }
		System.out.println("YOU LOST, NUM IS :"+x);
	
	
		
	}
	
	public static void main(String[] args) {
		new RandomNumbers().find();
	}
	
	
	
}


