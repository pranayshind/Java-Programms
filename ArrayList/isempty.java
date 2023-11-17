 
package ArrayList;

import java.util.ArrayList;

public class isempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.isEmpty()); //return true if list is empty
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println(list.isEmpty());  //returns false if list is not empty

	}

}
