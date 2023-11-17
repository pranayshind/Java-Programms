package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linked_hashset_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s = new LinkedHashSet();
		s.add("Arun");
		s.add("Ravi");
		s.add("Vijay");
		s.add("Sumit");
		System.out.println("Initial list of elemmnts is: "+s);
		
		s.remove("Ravi");
		System.out.println("After removing elements : "+s);
		
		LinkedHashSet<String> s1=new LinkedHashSet();
		s1.add("Ajay");
		s1.add("Gaurav");
		s.addAll(s1);
		
		
		
		System.out.println("updated list is: "+s);
		
		s.removeAll(s1);
		System.out.println("After using remove  all method: "+s); //remove all new elements 
		
		s.removeIf(str->str.contains("Vijay"));
		System.out.println("After using remove if method: "+s);
		
		s.clear();
		System.out.println("After using clear method: "+s);
		 

	}

}
