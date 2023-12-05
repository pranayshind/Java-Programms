package MAP;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(110, "Rohit");
		m.put(181, "Gill");
		m.put(102, "Virat");
		
		System.out.println("Initial list of elements: ");
		System.out.println("After invoking put method: ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			
		}
		
		
		m.putIfAbsent(118, "shreyas");
		System.out.println("After invoking putIfAbsent method: ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(119, "Shami");
		m.putAll(m1);//store all elments in m
		System.out.println("After invoking putAll method: ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		
		
		m.replace(119,"Bumrah");//store all elments in m
		System.out.println("After invoking replace method: ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		
		m.replace(119,"Bumrah","Siraj");//store all elments in m
		System.out.println("After invoking replace(k,v,v) method: ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		
		m.replaceAll((k,v)->"Surya");//store all elments in m
		System.out.println("After invoking replaceAll method ");
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		System.out.println("After invoking remove method ");
		m.remove(181);
		for(Map.Entry o1:m.entrySet()) {
			System.out.println(o1.getKey()+" "+o1.getValue());
			}
		
		
		
		
		
		
		
		
		
		

	}

}
