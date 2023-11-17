package Set;
import java.util.*;

public class hashset_from_another_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l=new ArrayList<String>();
		l.add("Ravi");
		l.add("Vijay");
		l.add("Ajay");
		l.add("Ravi");// this will remove after adding list l into set object s because set doesnt allow duplicate values 
		
		HashSet<String> s=new HashSet(l);
		s.add("Gaurav");
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
