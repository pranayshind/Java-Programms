package ArrayList;

import java.util.ArrayList;

public class get_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("Apple");
		list.add("Grapes");
		System.out.println("returning element : "+list.get(1));  // return second element
		list.set(1, "Dates");   //changing element
		
		//traversing list
		for(String fruit:list) {
			System.out.println(fruit);
			
		}
		

	}

}
