package Sample;



import java.util.Scanner;

public class EmployeeTest  {
	
	public static void main(String[] args) {
		/* Employee emp1 = new Employee("mani","mallam",12345678,600);
		 Scanner sc = new Scanner(System.in);
		
		 
		 
		 System.out.println("enter value ");
		
		 int monthlySal=sc.nextInt();
	
		emp1.setMothlySal(monthlySal);
		System.out.println("yearly salary of emp1 ;"+emp1.getMothlySal()*12);
		 
		
		//Employee emp2=new Employee("ABE","DEVILLERS",45678321,600);
		int mothlySal=sc.nextInt();
		emp2.setMothlySal(mothlySal);
		System.out.println(" yearly sal of emp2"+emp2.getMothlySal()*12);*/
	
		Employee emp1= new Employee("peter","wilison",123456789);
		 
		Scanner sc = new Scanner(System.in);
	  
		//System.out.println("FRIST NAME :"+fristName+""+lastName+""+employeeId);
		System.out.println("enter monthly sal of emp1");
		int sal =sc.nextInt();
		
		emp1.setMothlySal(sal);
		emp1.emp();
		System.out.println("employee1 yearly salary :"+emp1.getMothlySal()*12);
		double bones1 =emp1.getMothlySal()*12/100*10;
		double total=bones1+emp1.getMothlySal()*12;
		System.out.println("with bones of emp1 :"+ total);
		
		Employee emp2=new Employee("mikle","kane",987654321);
		
		
		System.out.println("enter monthly sal of emp2");
		int sal2=sc.nextInt();
		emp2.setMothlySal(sal2);
		System.out.println("employee2 yearly salary :"+emp2.getMothlySal()*12);
	    double bones=emp2.getMothlySal()*12/100*10;
	  double total2=emp2.getMothlySal()*12+bones;
	    System.out.println("with bones of emp2 :"+bones);
		emp2.emp();
		
		
		
		
	}

}
