package collection;

import java.util.LinkedList;

public class LinkedLis {
	public static void main(String[] args) {
		LinkedList <String> li= new LinkedList<String> ();
		li.add("red");
		li.add("white");
		li.add("orang");
		li.add("red");
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.get(3));
		System.out.println(li.removeFirst());
		System.out.println(li);
		
	}

}
