package Basic;
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args)
	{
		
	
	Restaurant r = new Restaurant();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("oder the food item");
	String food=sc.nextLine();
	r.setFoodItem(food);
	System.out.println("food item names"+r.getFoodItem());
	
	System.out.println("bill");
	double bill = sc.nextDouble();
	r.setPriceItem(bill);
	System.out.println("bill recipet"+r.getPriceItem());

	
	
	}

	
	}
	
