package Linkedlist;
import java.util.LinkedList;
public class method_linkeddlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l =new LinkedList<String>();
		l.add("Ravi");
		l.add("Vijay");
		l.add("Ajay");
		l.add("Ravi");
		System.out.println("initial linked list is: "+l);
		
		l.add("Gaurav");
		l.add("sam");
		System.out.println("After adding element to linked list: "+l);
		
		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("Raj");
		l1.add("Vinay");
		System.out.println("second linked list is: "+l1);
		l.addAll(l1);
		System.out.println("After concating 2 linked list: "+l);
		
		LinkedList<String> l2 =new LinkedList<String>();
		l2.add("Ram");
		l2.add("Vikas");
		System.out.println("third linked list is: "+l2);
		l.addAll(1,l2);
		System.out.println("After adding elements of 3rd linked list at specific index of first linked list: "+l);
		
		l.addFirst("Rakesh");
		l.addLast("Ramesh");
		System.out.println("After adding first element and last element"+l);
		
		LinkedList<String> l3 =new LinkedList<String>();
		l3.add("Ravi");
		l3.add("Vijay");
		
		System.out.println("fourth linked list is: "+l3);
		l.removeAll(l3);
		System.out.println("After  removing common elements from both linked list: "+l);
		l.clear();
		System.out.println("After clearing entire first linked list :"+l);

		
		
		
		
		
		
		
		

		
		
		
		
		
		



	}

}
