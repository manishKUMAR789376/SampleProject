package collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) throws IOException 
	
	{
	
		/*System.out.println("Enter Gross payment");
		    grossPay=sc.nextDouble();
		
		  System.out.println("all other cuttings");
		  ac=sc.nextDouble();
		  System.out.println("");*/
		
		  
		//netsalary=grossPay-ac;	
		//System.out.println("netsalary "+netsalary);
		try {
		FileOutputStream file =new FileOutputStream("D://TABLE.TXT");
		double highsal=0;
		String name="";
		for(int i=1;i<=3;i++) {
		System.out.println("enter the name of emp "+i);
		Scanner sc = new Scanner(System.in);
		String sr=sc.next();
		System.out.println("enter  yearly salary of emp");
		double sal=sc.nextDouble();
		//double yearsal=sal*10000;
		double grosssal=sal/12;
		double netsal=grosssal*0.5;
		if(netsal>highsal) {
			highsal=netsal;
			name=sr;
			
		}
		String txt=i+"."+" for emp"+sr+" gross sal " +grosssal+" netsal "+netsal;
		byte[] ar=txt.getBytes();
		file.write(ar);
		System.out.println("data stored in file");
		System.out.println();
		}
		System.out.println("emps detalis ");
		
	/*	FileOutputStream fr=new FileOutputStream("D://TABLE.TXT");
		int i;
		while(( i= fr.read())!=-1) {
			System.out.print((char)i);
		
		}*/
		System.out.println(name+" max sal "+highsal);
		file.close();
			
		    
		    	
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
			
			
		}
}
	


