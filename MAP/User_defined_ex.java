package MAP;

import java.util.HashMap;
import java.util.Map;

class Book{
	int id;
	String name, author, publisher;
	int quantity;
	
public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}


}

	public class User_defined_ex{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,Book> m = new HashMap<Integer,Book>();
		 Book b7=new Book(87,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		 Book b4=new Book(108,"Operating System","Galvin","Wiley",6);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		 Book b6=new Book(114,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
		 
	
		 m.put(2, b2);
		 m.put(1, b1);
		 m.put(3, b3);
		 m.put(7, b6);
		 m.put(4, b4);
		 m.put(6, b6);
		 
		 for(Map.Entry<Integer,Book> o1:m.entrySet()) {
			 int key = o1.getKey();
			 Book b = o1.getValue();
			 System.out.println(key+" Details: ");
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		 }
		

	}
	}

