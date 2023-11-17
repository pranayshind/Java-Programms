package ArrayList;

import java.util.ArrayList;

public class retainall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("gaurav");
		list.add("Anuj");
		System.out.println("initial list of elements: "+list); 
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ravi");
		list1.add("Vilas");
		list1.add("Anuj");
		System.out.println("initial list of elements: "+list1); 
		
		list.retainAll(list1);   //returns common elements in both list
		System.out.println("list after retaining: "+list);
		
		
		

	}

}
