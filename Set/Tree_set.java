package Set;
import java.util.*;
public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a = new TreeSet<String>();
		a.add("Ravi");
		a.add("Vijay");
		a.add("Ravi");
		a.add("Ajay");
		
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
