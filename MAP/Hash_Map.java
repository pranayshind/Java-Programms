package MAP;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hash map allows 1 null keys and multiple null values. if we give multipple keys it will give one latest null key
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(110, "Rohit");
		m.put(181, "Gill");
		m.put(102, "Virat");
		m.put(108, "Virat");
		m.put(105, "Virat");
		m.put(null, "sachin");
		m.put(null, "rok");
		m.put(null, null);
		m.put(101, null);
		m.put(178, null);
		for(Map.Entry m1:m.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}

	}

}
