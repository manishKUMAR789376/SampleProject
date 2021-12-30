package Inheritance;

import java.util.Scanner;

public class Second extends Frist {
	int c;
	double d;
	public void method2(int c,double d) {
		System.out.println("SUB"+ (c-d));
	}
	public static void main(String[] args) {
		
		Second s=new Second();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the value");
		int x =sc.nextInt();
		int y=sc.nextInt();
		s.method1(x, y);
		int v=sc.nextInt();
		double z=sc.nextDouble();
		s.method2(v, z);
		
				
		
	}
	

}
