package MAP;
//navigable map extends sorted interface  hence all sortedMap mehods are avaliable in navigable map

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigable_map_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul"); 
	      map.put(106,"Prem"); 
	      map.put(105,"Sam"); 
	      map.put(104,"Rock"); 
	      
	      System.out.println("head method: "+map.headMap(102));
	      System.out.println("head method: "+map.headMap(102,true));
	      
	      System.out.println("reverse oreder: "+map.descendingMap());
	      
//It is used to return a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key.
	      System.out.println("Ceiling entry: "+map.ceilingEntry(95));
//returns the least key greater than or equal to the given key or null if the such a key is absent.
	      System.out.println("Ceiling key: "+map.ceilingKey(96));
//It is used to return a key-value mapping associated with the  key lower than or equal to the given key, or null if there is no such key.	      
	      System.out.println("Floor entry: "+map.floorEntry(107));
	      System.out.println("Floor key: "+map.floorKey(109));
//return an entry with lowest key among those keys among those whose keys are greater than specified key
	      System.out.println("higher entry: "+map.higherEntry(104));
	      System.out.println("higher key: "+map.higherKey(101));
//return an entry with highest key among those keys among those whose keys are lower than specified key	      
	      System.out.println("Lower entry: "+map.lowerEntry(104));
	      System.out.println("Lower entry: "+map.lowerKey(104));
	      
	      System.out.println("First entry: "+map.firstEntry());
	      System.out.println("first key: "+map.firstKey());
	      System.out.println("Last entry: "+map.lastEntry());
	      System.out.println("Last key: "+map.lastKey());
	      
	      map.pollFirstEntry();// removes first entry in sorted map
	      System.out.println(map);
	      map.pollLastEntry();// removes last entry in sorted map
	      System.out.println(map);
	      

	}

}
