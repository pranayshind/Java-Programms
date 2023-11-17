package Set;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
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
		HashSet<Book> s = new HashSet<Book>();
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		Book b4=new Book(103,"Operating System","Galvin","Wiley",6); // it will print even value is same becuase object is different 
		
		s.add(b1);
		s.add(b2);
		s.add(b3);
		s.add(b4); 
		
		for(Book b:s) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		

	}

}
