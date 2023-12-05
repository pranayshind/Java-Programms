package MAP;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.SortedMap;

public class TreeMAp_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SortedMap<Integer,String> map=new TreeMap<Integer,String>(); 
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");  
	      map.put(107,"Ram"); 
	      map.put(104,"Raj"); 
	      map.put(108,"Rakesh"); 
	      map.put(109,"Sandip"); 
	      
	      
	      System.out.println("Sorted map: "+map);
	      System.out.println("First Key: "+map.firstKey());
	      System.out.println("Last key: "+map.lastKey());
	      map.remove(104);
	      System.out.println(map);
	      
	      System.out.println("headmap: "+map.headMap(102));
	      System.out.println("tailmap: "+map.tailMap(102));
	      System.out.println("subMap: "+map.subMap(100,108));
	      
	      System.out.println(map.comparator());
	        

	      
	        
	     

	}

}
