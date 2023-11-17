package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet a = new TreeSet();
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(35);
		a.add(90);
		a.add(55);
		a.add(67);
		
		System.out.println(a);
		System.out.println(a.descendingSet());//to print in reverse order
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.clone());
		System.out.println(a.contains(20));
		
		
		System.out.println(a.subSet(30,55));// to print subset .....here starting value is inclusive and ending value is exclusive
		System.out.println(a.subSet(30,false,55,true));//here starting value is exclusive and ending value is inclusive
		System.out.println("lowest element is: "+ a.first());
		System.out.println("highest element is: "+ a.last());
		System.out.println("nearest highest element of 50 is "+a.higher(50));
		System.out.println("nearest lowest element of 50 is " +a.lower(50));
		System.out.println("display lowest number above 50: "+a.ceiling(50));
		System.out.println("display highest number below 50: "+a.floor(50));
		
		System.out.println(a.pollFirst());//remove first element from set
		System.out.println(a.pollLast());//remove last element of set
		System.out.println(a);
		
		System.out.println(a.headSet(55));// display numbers before 55
		
	
		System.out.println(a.headSet(55,true));//to include 55 
		
		System.out.println(a.tailSet(55));//display numbers after 55
		System.out.println(a.tailSet(55,true));
		System.out.println(a.tailSet(55,false));//to not include 55
		
		a.clear();
		System.out.print(a);

		
				
		
		
		/*
		 * Iterator i = a.iterator(); while(i.hasNext()) { System.out.println(i.next());
		 * }
		 */
		

	}

}
