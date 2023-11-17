package Set;
import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		s.add("one");
		Iterator<String>i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
