package TI;

import java.util.Scanner;

public class Main1 {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter value");
	int n= sc.nextInt();
	int[]dup=new int[1000];
	for(int i=0;i<n;i++) {
		System.out.println("enter the array number");
		int temp=sc.nextInt();
		dup[temp]++; 
		
	}
	for(int i=1;i<=1000;i++) {
		if(dup[i]==1) {
			System.out.println(i);
			return;
		}
	}
}
}
