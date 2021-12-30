//------ASSIGNMENT 4A
package Assignment;

import java.util.Scanner;

public class Movie {
	private String movieName;
	private String movieCategory;
	private int ticketCost;
	                                               //{ASSINGMENT 4A MOIVE&MAIN CLASS}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public  int calculateTicketCost(String circle) {
		String category=getMovieCategory();
		if( circle.equalsIgnoreCase("gold") && category.equalsIgnoreCase("3D")) {
			setTicketCost(500);
			return 0;
		}
		else if(circle.equalsIgnoreCase("gold") && category.equalsIgnoreCase("2D"))
		{
			setTicketCost(300);
			return 0;
		}
		else if(circle.equalsIgnoreCase("silver") && category.equalsIgnoreCase("3D"))
		{
			setTicketCost(450);
			return 0;
			
		}
		else if(circle.equalsIgnoreCase("silver") && category.equalsIgnoreCase("2D"))
		{
			setTicketCost(250);
			return 0;
		}
		else if(category.equalsIgnoreCase("2D")  || category.equalsIgnoreCase("3D")) {
			
			return -1;
		}
		else if(circle.equalsIgnoreCase("gold")|| circle.equalsIgnoreCase("silver"))
		{
			return -2;
		}
		return -3;
		
		
	}
}	
	


