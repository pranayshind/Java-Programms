/*
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

Example of default constructor that displays the default values
//Let us see another example of default constructor  
//which displays the default values  
*/

package oops;

public class Student3 {
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s = new Student3();
		s.display();

	}

}
//In the above class,you are not creating any constructor so compiler provides you a default constructor. 
//Here 0 and null values are provided by default constructor.

