package MAP;

import java.util.LinkedHashMap;

//insertion oreder is maintained in linkedhashset

public class Linked_hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer,String>();
		m.put(100, "Amit");
		m.put(101, "Vijay");
		m.put(102, "Rahul");
		m.put(101, "Vijay");
		
		System.out.println("Keys : "+m.keySet());
		System.out.println("Values: "+m.values());
		System.out.println("Key-value pairs: "+m.entrySet());



	}

}
