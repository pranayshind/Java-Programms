

/*1.hashtable is an array of list
2.each list is known as bucket
3.java hash table class doesnt allow null key or value
4.hashtable is child of map hence all methods of map is applicable here
5.difference between hashmap and hashtable is in hashmap 1 key can store only one value but in hashtable one key can store list of elements/mutiple values
*/
package Hash_table;

import java.util.Hashtable;
import java.util.Map;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String > h = new Hashtable<Integer,String>();
		h.put(100, "Amit");
		h.put(140, "Ajay");
		h.put(102, "Rakesh");
		h.put(103, "Jay");
		h.put(101, "Raj");
		
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Before remove: "+h);
		h.remove(140);
		System.out.println("After remove: "+h);
		
		System.out.println("getordefault method");
		System.out.println(h.getOrDefault(101, "NOt found"));
		System.out.println(h.getOrDefault(108, "NOt found"));
		
		System.out.println("initial map: "+h);
		h.putIfAbsent(104, "Gaurav");
		System.out.println("updated map: "+h);
		h.putIfAbsent(104, "Raj");// if key is already present in map then it will not override value
		System.out.println("updated map: "+h);

	}

}
