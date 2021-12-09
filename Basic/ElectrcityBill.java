package Basic;

import java.util.Scanner;

public class ElectrcityBill {
	public static void calculateBill() {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter no of units of  user-1");
		 int units=sc.nextInt();
		  if(units>=1 && units<=100 ) {
			 System.out.println("electricity bill of User-1: "+0);
		  
		  }else if(units>=101 && units<=200) {
			 System.out.println(" electricity bill of user-1:"+(units-100)*1.5);
		   
		  }
		 else {
			 System.out.println("electricity bill of user-1:"+(units-100)*6.6);
		 }
		  
		  System.out.println("enter no of unit2 of user-2");
		  int unit2=sc.nextInt();
		  
		  if(unit2>=1 && unit2<=100) {
			  System.out.println("electricity bill of user-2"+0);
		  }
		  else if(unit2>=101 && unit2<=200) {
			  System.out.println("electricity bill of user-2"+(unit2-100)*2);
			  
		  }  
	      else if(unit2>=201 && unit2<=500) {
		  System.out.println("electricity bill of user-2 :"+(unit2-100)*3);
	     }
		  else {
			  System.out.println("electricity bill of user-2"+(unit2-100)*6.6);
		  }
		  
		  System.out.println("enter units of user -3");
		  int unit3=sc.nextInt();
		  
		  if(unit3>=1 && unit3<=100) {
			  System.out.println("electricity bill of user-3 : "+(unit3-100)*0);
		  }
		  else if(unit3>=100 && unit3>=200){
			  System.out.println("electricity bill of user-3"+(unit3-100)*3.5);
		  }
		  else if(unit3>=201 && unit3<=500) {
			  System.out.println("electricity bill of user-3: "+(unit3-100)*4.6);
		  }
		  else {
			  System.out.println("electricity bill of user-3"+(unit3-100)*6.6);
			  
		  }
	}

    public static void main(String[] args) {
    	ElectrcityBill eb = new ElectrcityBill();
    	eb.calculateBill();
	}
}
		 
		
		
			
	


