package Inheritance;

public class Abstra2  extends Abstra{
	int e=23;
	public void mul() {
		int a=23;
		int b=32;
		System.out.println(a*b);
		
	}
	public void add() {
		
		double d=2.3;
		Abstra2 ab = new Abstra2();
		System.out.println(ab.e+d);
	}
	public static void main(String[] args) {
		Abstra a= new Abstra2();
		a.add();
		a.mul();
		
		
	}

}
