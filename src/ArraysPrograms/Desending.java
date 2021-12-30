package ArraysPrograms;

import java.util.Scanner;

public class Desending {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the value of  array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("desending ");
		for(int i=0;i<size-1;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println(arr[size-1]);
		
	}

}
