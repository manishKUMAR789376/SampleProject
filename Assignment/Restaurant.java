// Assignment 10
package Assignment;

import java.util.Scanner;

public class Restaurant {       //Assignment =10;
	public double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	
	private static boolean ordering = true;
	 static Scanner sc=new Scanner(System.in);
	
	/*public static void main() {
		System.out.println("welcome \n1.Chicken Biryani (Rs 200) \n2.mutton briyani(rs 250) \3.veg biryani(Rs150)");
	}*/
	public static double itemPrice(int foodItem) {
		if(foodItem == 1) {
			System.out.println("You've ordered a chicken biryani");
			itemPrice=200;
			
		}
		if(foodItem==2) {
			System.out.println("you've ordered a mutton biryani");
			itemPrice=250;
		}
		if(foodItem==3) {
			System.out.println("you've ordered a veg biryani");
			itemPrice=150;
		}
		quantity();
		return itemPrice;
	}
	public static double quantity() {
		System.out.println("ENTER QUANTITY");
		double quantity = sc.nextDouble();
		subTotal(quantity,itemPrice);
		
		return quantity;
				
		
	}
	public  static void subTotal(double quantity, double itemPrice2) {
		double subTotal=quantity*itemPrice;
		System.out.println("subtotal :"+subTotal);
		return;
		
	}
	public static void done(double runningTotal) {
		ordering =false;
		System.out.println(runningTotal);
		System.out.println("ENJOY YOUR MEAL");
		
	}
	public static void main(String[] args) {
		  int menuOption;
		  int foodItem = 0;
		  sc = new Scanner(System.in);
		  double runningTotal=0;
		  do{
		    menu();
		    menuOption = sc.nextInt();
		    switch(menuOption){
		      case 1:
		        foodItem = 1;
		        runningTotal += itemPrice(foodItem);
		        break;
		      case 2:
		        foodItem = 2;
		        runningTotal += itemPrice(foodItem);
		        break;
		      case 3:
		        foodItem = 3;
		        runningTotal += itemPrice(foodItem);
		        break;
		      case 4:
		        done(runningTotal);
		        break;
		      default:
		        System.out.println("item is unavalible .");
		    }
		  } while(ordering);
		  System.out.println("Total amount: " + runningTotal);
		}
	

	private static void menu() {
		System.out.println("welcome \n1.Chicken Biryani (Rs 200) \n2.mutton briyani(rs 250) \n3.veg biryani(Rs150) \n4.check total");
		
	}
	
	
}
