package Sample;

import java.util.Scanner;

import Basic.ElectrcityBill;

public class Bill {
      public static void calculateBill() {
		
		Scanner sc= new Scanner(System.in);
	 System.out.println("enter units of user -3");
	  int unit3=sc.nextInt();
	  double charge = 0;
	  if(unit3<=100) {
		  
		  System.out.println("electricity bill of user-3 : "+charge);//
	  }
	  else if(unit3>=100 && unit3<=200){
		 charge=100*0+(unit3-100)*1.5;
		  System.out.println("electricity bill of user-3 ="+charge);//100*0+(unit3-100)*1.5
	  }
	  else if(unit3>=201 && unit3<=500) {
		 charge=100*2+(unit3-200)*3;
		  System.out.println("electricity bill of user-3: "+charge);//100*2+(unit3-200)*3
	  }
	  else {
	  
		 charge=100*3.5+300*4.6+(unit3-500)*6.6;
		  System.out.println("electricity bill of user-3 "+charge);//100*3.5+300*4.6+(unit3-500)*6.6
	  }
	  
	  }

	  public static void main(String[] args) {
		  Bill eb = new Bill();
	    	eb.calculateBill();
	  }
	
	
}

