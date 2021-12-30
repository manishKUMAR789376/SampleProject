package ArraysPrograms;

import java.util.Scanner;

public class Thridlargest {
  public static void main(String[] args) {
	int temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	//int arr[]= {10,15,51,21,76};
	//size=arr.length;
	int arr[]=new int[size];
	System.out.println("enter value of  array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
	
	System.out.println("third largest =" +arr[size-3]);
	System.out.println("third smallest =" + arr[2]);
}


}
