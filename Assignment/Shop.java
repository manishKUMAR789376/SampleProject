//Assignment 1b
package Assignment;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {                      //Assignment =1B{ITEM}
	static ArrayList<Item> list=new ArrayList<Item>();
	
public static void main(String[] args) 
{
	
	String itemName;
	double itemPrice;
	int quantity;
	
	
	
	
	Scanner sc = new Scanner(System.in);
	String keepShopping="y";
	
	
	do {
		System.out.println("Enter the Name of the Item ; ");
		itemName=sc.nextLine();
		
		
		System.out.println("Enter the price of item : ");
		itemPrice=sc.nextDouble();
		
		System.out.println("Enter the quantity : ");
		quantity=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Continue shopping (y/n)? ");
		
		keepShopping=sc.nextLine();
		  Item t = new Item(itemName, itemPrice, quantity);
		list.add(t);
	}
	
	while(keepShopping.equalsIgnoreCase("y"));
	System.out.println();
	System.out.println("Final shopping cart totals bill :");
  
	for(Item i:list)
	System.out.println(i);
   
     
   }
}
	


		
		


