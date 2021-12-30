package exceptions;

public class Bus {
	public static void main(String[] args) {
		try {
	
		throw new TickectAreUnavailbleException("not avalible");
		}
		catch(TickectAreUnavailbleException e) {
			System.out.println("seat  ");
			System.out.println(e);
		}
	}
}
	

		
	  
  


