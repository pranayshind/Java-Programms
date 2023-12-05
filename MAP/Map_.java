package MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(110, "Rohit");
		m.put(181, "Gill");
		m.put(102, "Virat");
		m.put(108, "Virat");
		m.put(105, "Virat");
		for(Map.Entry m1:m.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		
		m.clear();
		System.out.println(m);

	}

}
