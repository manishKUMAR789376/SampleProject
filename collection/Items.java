package collection;

public class Items {

		private String ItemName;
	    private double ItemPrice;
	    private int ItemQty;
	    private double tax;
	   


		

	/*public Items()       ///ITEMS,SHOPPING
	{
	        ItemName = "moblie";
	        ItemPrice = 1000;
	        ItemQty = 1;
	        tax=100;

	}*/

	    public Items(String ItemName, double ItemPrice, int ItemQty, double tax )
	{
	        this.ItemName = ItemName;
	        this.ItemPrice = ItemPrice;
	        this.ItemQty = ItemQty;
	        this.tax=tax;

	}


	public String getItemName() {
	    return ItemName;
	}

	public double getItemPrice() {
	    return ItemPrice;
	}

	public double getItemTotalPrice() {
	    return ItemPrice * ItemQty;
	}

	public int getItemQty() {
	    return ItemQty;
	}

	public void setItemName(String ItemName)
	{
	    this.ItemName = ItemName;
	}

	    public void setItempPrice(double ItemPrice)
	{
	    this.ItemPrice = ItemPrice;
	}

	    public void setItemQty(int ItemQty)
	{
	    this.ItemQty = ItemQty;
	}
	    public double getTax() {
			return tax;
		}


		public void setTax(double tax) {
			this.tax = tax;
		}


	    @Override
	public String toString()
	{
	   String state = ItemName + " -  €" + ItemPrice+ " x "+ItemQty+" + "+tax+" total = "+(ItemPrice*ItemQty+tax);//+ " x "
	    
	    return state;
	}
	}


