package Stringp;

import java.util.Scanner;

public class Bus {
	
 
	public void tickets(int members) {
		Scanner sc = new Scanner(System.in);
		double charge=0;
		for(int i=0;i<=members;i++) {
			System.out.println("enter age of the member:"+i);
			int age=sc.nextInt();
			if(age <=3) { 
				//charge+=0;
				System.out.println("age between 1-3 chlids no charges"+(charge+=0));
			}
			else if(age>=3 && age<=13) { 
				//charge+=70;
				System.out.println("the age between(3-12) group charges"+(charge+=70));
			}
			else if(age>=13 && age<=20) {
				//charge+=120;
				System.out.println("(13-20 :"+(charge+120));
			}
			else if(age>=22 && age<=54) { 
				//charge+=200;
			 System.out.println(" 22-54"+(charge+=200));
			}
			
			
			else {
				System.out.println(" na");
			
			}
		// System.out.println(charge);
		 double taxes=(0.02)*charge;
		 System.out.println("taxex "+taxes);
		 System.out.println("total charge all "+charge+taxes);
		 System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of member");
		int t1=sc.nextInt();
		Bus b= new Bus();
		b.tickets(t1);
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("select no of ticket");
		int n= sc.nextInt();
	
		for(int i=0;i<n;i++) {
		int age=i;
		if(age <=3) {
			System.out.println("age between 1-3 chlids no charges");
		}
		else if(age>=3 && age<=13) {
			System.out.println("the age between(3-12) group charges"+70);
		}
		else if(age>=13 && age<=20) {
			System.out.println("(13-20 :"+120);
		}
		else if(age>=21 && age<=54) {
			System.out.println(" 22-54"+200);
		}
		else if {
			System.out.println(" above 55"+270);
		}
		else {
			System.out.println(" above 55"+270);
		
		}
		}*/
		
	}
		}


