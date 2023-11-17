package ArrayList;
import java.util.ArrayList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id = id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}


public class userdefined_books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> l = new ArrayList<Book>();
		Book b1 = new Book(101,"letusc","yashwant","P.K.House",10);
		Book b2 = new Book(102,"yayati","vishwaspatil","R.K",5);
		Book b3 = new Book(103,"DSAjava","james","Hill",14);
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
		
		for(Book b:l) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		

	}

}
