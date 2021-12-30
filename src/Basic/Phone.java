package Basic;

import java.util.Scanner;

public class Phone implements Flipkart {
	Scanner sc = new Scanner(System.in);
	
	double discount=sc.nextDouble();
		public void price() {
			
		String name=sc.next();
		System.out.println("brand "+name);
		
		
	}
	public void tax() {
		int rs=sc.nextInt();
		double gst=sc.nextDouble();
		
		double total=rs+gst;
		System.out.println(total);
		
		
	}
	public static void main1(String[] args) {
	
		Flipkart p = new Phone();
		p.price();
		p.tax();

		

	}
}
		
	
	
		
			

	


