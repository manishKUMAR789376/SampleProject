package collection;

import java.util.*;
import java.util.Scanner;

public class ShoppingList {
	ArrayList<Items> list = new ArrayList<Items>();     ///ITEMS,SHOPPING
    
         public void addItem()
    { 
            System.out.println();
            System.out.println("enter in the name of your item");
            Scanner sc = new Scanner(System.in);
            String ItemName = sc.nextLine();

            System.out.println("enter in the price of your item");
            double ItemPrice = sc.nextDouble();

            System.out.println("enter in the Qty of your item");
            int ItemQty = sc.nextInt();
            System.out.println("enter the tax of item");
            double tax=sc.nextDouble();
            

            Items Item = new Items(ItemName, ItemPrice,
                        ItemQty, tax);
            list.add(Item);
            System.out.println("Item Added");
    }

     
         public void displayItem(){
             System.out.println( list.size()+ " items. ");
                for (Items x : list) {
                    System.out.println(x.toString());
                }
         }
}
