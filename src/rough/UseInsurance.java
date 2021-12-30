package rough;
import java.util.*;
public class UseInsurance {

	public static void main(String [] str) throws Exception
	{
	Insurance item;
	char inputChar;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("What type of insurance do you wish?");
	System.out.println("Enter 1 for Health ");
	System.out.println(" 2 for Life ");
	System.out.println(" 3 for Auto ");
	inputChar = keyboard.next().charAt(0);

	if(inputChar == '1')
	item = new HealthInsurance(3233,200,2400);

	else if(inputChar == '2')
	item = new LifeInsurance(1234,100,1200);

	else if(inputChar == '3')
	item = new AutoInsurance(3333, 50, 600, "987654321A2008B");
	else
	{
	System.out.println("Invalid Insurance Choice");
	return;
	}
	item.print();
	}
	}
