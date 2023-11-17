package Set;
import java.util.*;


//linkedhashset maintains inserrtion order which is not possible in hashset this is the only difference between hashset and linked hashset
public class linked_hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s = new LinkedHashSet();
		s.add("One");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		s.add("three");
		
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
