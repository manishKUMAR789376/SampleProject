//---ASSIGNMENT 4B
package Assignment;

import java.util.Scanner;

public class Main {
	
	public static Movie getMovieDetails()            //{ASSIGNMENT 4B MOVIE&MAIN CLASS}
	{
		Movie movie = new Movie();
		Scanner sc= new Scanner(System.in);
		System.out.println("--//ENTER THE MOVIE NAME\\--");
		movie.setMovieName(sc.nextLine());
		System.out.println("--//ENTER THE CATEGORY--\\");
		movie.setMovieCategory(sc.nextLine());
		return movie;
		
	}
	public  static String getCircle() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE CIRCLE");
		return(sc.nextLine());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Movie movie=getMovieDetails();
		 String circle=getCircle();
		 int type=movie.calculateTicketCost(circle);
		 System.out.println("MOVIE NAME="+movie.getMovieName());
		 System.out.println("MOVIE CATEGORY="+movie.getMovieCategory());
		 if(type==0) 
			 System.out.println("THE TICKET COST IS ="+movie.getTicketCost());
	     if(type==1)
	    	 System.out.println("SORRY THERE IS NO "+movie.getMovieCategory()+"TYPE CATEGORY IN THEATER");
	     if(type==-1)
	    	 System.out.println("Sorry , both circle and category are invalid ");
	     
		 }
		
		
	}


