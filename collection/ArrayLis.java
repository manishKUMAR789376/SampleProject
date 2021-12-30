package collection;

import java.util.*;

public class ArrayLis {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer> ();
		list.add(12);
		list.add(32);
		list.add(12);
		list.add(34);
		//System.out.println(list.contains(4));//only 3 index True
		//System.out.println(list.get(2));
		 ListIterator<Integer> li = list.listIterator();
		  System.out.println(li.next());
		  System.out.println(li.next());
		 System.out.println(li.hasNext());
		  System.out.println(li.previous());
		  System.out.println(li.next());
		  //System.out.println(li.hasPrevious());
		  //System.out.println(li.next());
		  //li.remove();
		  System.out.println(list);
		
		
	}

}
