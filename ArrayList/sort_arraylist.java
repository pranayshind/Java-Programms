package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		//creating list of fruits
		list.add("mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		
		//sorting list
		Collections.sort(list);
		System.out.println("sorting strings");
		//traversing list through for each loop
		for(String f:list) {
			System.out.println(f);
		}
		
		System.out.println("sorting numbers");
		List<Integer> list2 = new ArrayList<Integer>();
		//creating list of numbers
		list2.add(21);
		list2.add(10);
		list2.add(40);
		list2.add(50);
		list2.add(5);
		//sorting list
		Collections.sort(list2);
		//traversing list through for each loop
		for(Integer n: list2) {
			System.out.println(n);
			
		}


	}

}
