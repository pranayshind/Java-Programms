package ArrayList;
import java.util.ArrayList;

public class add_or_addall {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("initial list of elements: "+list); 
		
		list.add(1,"Gaurav");
		System.out.println("after inserting : "+list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sonu");
		list2.add("Hanu");
		
		list.addAll(list2);
		System.out.println("After concanitating 2 list: "+list);  //list2 elements get added to list elements and we need print list and list 2 remain as it is
		
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("John");
		list3.add("Rahul");
		
		list.addAll(1,list3);
		System.out.println("After adding elements from other list to first list at specific index: "+list);
		
		
		

		
		

	}
}
