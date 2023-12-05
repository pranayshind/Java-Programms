package Hash_table;

import java.util.Hashtable;
import java.util.Map;

class Books{
	int id;
	String name,author,publisher;
	int quantity;
	public Books(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	
}

public class user_defined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Books> obj = new Hashtable<Integer,Books>();
		Books b1 = new Books(187,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Books b2 = new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Books b3 = new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Books b4 =new Books(108,"Operating System","Galvin","Wiley",6);
		
		obj.put(1, b1);
		obj.put(2,b2);
		obj.put(3, b3);
		obj.put(4, b4);
		
		for(Map.Entry<Integer,Books> o1:obj.entrySet()) {
			int k = o1.getKey();
			Books b = o1.getValue();
			System.out.println("Details: "+k);
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		

	}

}
