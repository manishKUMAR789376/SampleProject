//Assignment 1A
package Assignment;

import java.text.NumberFormat;

public class Item {

	private String  name;
	private double  price;                      //Assignment=1A, {CLASS SHOP}
	private  int   quantity;
	//private  itemPrice;
	
	public Item(String name,double price, int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString()
	{
		//NumberFormat fmt=NumberFormat.getCurrencyInstance();
		//String str=name.length()>8 ? "/t" : "/t/t";
		double total=0;
		double overAllTotal=0;
		 
		String state= name+"   "+price+"   "+quantity+"   "+((price) * (quantity));
		total=((price) * (quantity));
		overAllTotal+=total;
		//System.out.println(overAllTotal);
		
		return state;
		//return total;
	}
}
