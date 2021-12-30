package exceptions;
//import java.lang.ArithmeticException;
public class Sample {
	public static void main(String[] args) {
		try {
			System.out.println("line 1");
		int val =10/0;//exception
	}
	catch(ArithmeticException e) {
		System.out.println(e+"");
	}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("final block");
	}
	}

}
