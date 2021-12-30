package Stringp;

import java.util.Scanner;

public class SortString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the strings");
		
		String str=sc.nextLine();
		int upper=0,lower=0,number=0,speciacalChar=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z') 
			upper++;
			
		
		else if(ch>='a' && ch<='z' )  
			lower++;
		
		
		else if(ch>='0' && ch<='9') 
		 number++;
		
		
		else 
			speciacalChar++;
			
		
		}
		System.out.println("upper case letter"+upper);
		System.out.println("lower case letter"+lower);
		 System.out.println("number case letter"+number);
		 System.out.println("special character letter"+speciacalChar);
		
	}
		
	}




