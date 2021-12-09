package Static;

public class Tri {
	static double pi=3.14;
	int length;
	int breath;
	public Tri(int length,int breath) {
		this.length=length;
		this.breath=breath;
	}
	public void findArea() {
		double area=0.5*length*breath;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Tri t1 = new Tri(2,5);
		Tri t2 = new Tri(3,6);
		t1.findArea();
		t2.findArea();
	}
	
}
