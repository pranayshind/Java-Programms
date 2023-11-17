package Set;
import java.util.*;


public class hashset_from_previous_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s=new HashSet();
		s.add("Gaurav");
		s.add("Ravi");
		s.add("Vijay");
		
		HashSet<String> s1=new HashSet(s);
		s1.add("Sanjay");
		s1.add("Shami");
		Iterator<String> i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
