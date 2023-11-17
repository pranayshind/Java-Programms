package Linkedlist;
import java.util.Iterator;
import java.util.LinkedList;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> l =new LinkedList<String>();
		l.add("Ravi");
		l.add("Vijay");
		l.add("Ajay");
		l.add("Ravi");
		System.out.println(l);
		
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());


		}
		
		
		
	}

}
