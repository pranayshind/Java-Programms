package MAP;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Entry<Integer, String> m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    

	}

}
