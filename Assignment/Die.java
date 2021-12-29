//Assignment 2
package Assignment;

import java.util.Random;



public class Die {
	 private int Sides;
	    private int value;
	   
	    private int die1;  
	    private int die2;  
	    private int myRollCount;  
	    private int mySides;      
	    private Random myRandGen;  
	    private int MAX = 6;  
	    private int countWComputer;
	    private int countWPlayer;
	    private String playerName;
	  
	 
	    public Die(String playerName) {
	        this.playerName=playerName;
	        countWComputer=0;
	        countWPlayer=0;
	        
	    }
	    public void roll() {
	        System.out.printf("%15s","Dice 1"+" (computer)");
	        System.out.printf("%15s","Dice 2"+" ("+playerName+")");
	        System.out.println();
	        for (int i = 1; i <= 10; i++) {
	            int q, p;
	            q = (int) (MAX * Math.random() + 1);
	            p = (int) (MAX * Math.random() + 1);
	            
	            System.out.printf("%15d",q);
	            System.out.printf("%15d",p);
	            System.out.println("%15");
	            if (p>q){
	                countWComputer++;
	            }else if (q>p){
	                countWPlayer++;
	            }
	          
	            
	        }
	        winner(countWComputer,countWPlayer);
	    }
	 
	    public int getDie1() {
	       
	        return die1;
	    }
	 
	    public void setDie1(int die1) {
	        this.die1 = die1;
	    }
	 
	    public void setValue(int value) {
	        this.value = value;
	    }
	 
	    public int getValue() {
	        return value;
	    }
	 
	    public void setSides(int sides) {
	        Sides = sides;
	    }
	 
	    public int getSides() {
	        return Sides;
	    }
	 
	    public void setMySides(int mySides) {
	        this.mySides = mySides;
	    }
	 
	    public int getDie2() {
	        
	        return die2;
	    }
	 
	    public void setDie2(int die2) {
	        this.die2 = die2;
	    }
	    private void winner(int countWComputer,int countWPlayer) {
	        if(countWComputer >countWPlayer) {
	            System.out.println("You got beat by a computer!");
	            System.out.println("Computer win "+countWComputer);
	            System.out.println(playerName+" win "+countWPlayer);
	        } else {
	            if (countWComputer < countWPlayer) {
	                System.out.println("You beat the computer!");
	                System.out.println("Computer win "+countWComputer);
	                System.out.println(playerName+" win "+countWPlayer);
	                
	            }else if(countWComputer == countWPlayer) {
	            	System.out.println("tie");
	            }
	            else {
	                System.out.println("The game has ended in a tie!");
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	        Die die=new Die("MANISH");
	        die.roll();
	    }
	}

