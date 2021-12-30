package Sample;



public class Employee {
	
	
	String fristName;
	String lastName;
	long   employeeId;
	
	static int    mothlySal=15000;

	/*@Override
	public String toString() {
		return "Employee [sc=" + sc + ", fristName=" + fristName + ", lastName=" + lastName + ", employeeId="
				+ employeeId + ", mothlySal=" + mothlySal + "]";
	}*/

	
	
	public Employee(String fristName,String lastName,long   employeeId) {
		this.fristName=fristName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		
			//System.out.println("FRIST NAME :"+ fristName+"lastName :"+ lastName+""+employeeId);
			
		
		
	}
	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public int getMothlySal() {
		return mothlySal;
	}

	public void  setMothlySal(int mothlySal){
		this.mothlySal = mothlySal;
		
		if(mothlySal != 0) {
			System.out.println(mothlySal);
		}
		else {
			System.out.println(0.0);
		}
	}
	public void emp() {
		System.out.println("FRIST NAME :"+ fristName+"last Name :"+lastName+"emp Id ;"+ employeeId);
		
	}

	
	

	

}

