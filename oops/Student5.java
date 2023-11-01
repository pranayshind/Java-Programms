/*Constructor Overloading in Java
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of
parameters in the list and their types.
*/


package oops;

public class Student5 {
	int id;
	String name;
	int age;
	
	
	//2 parameterized constructor
	Student5(int i, String n) {
		id =i;
		name =n;
		
	}
	//3 parametrized constructor
	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	//display method
	void display() {
		System.out.println(id+" "+name+" "+age);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 a1 = new Student5(11,"Pranay");
		Student5 a2 = new Student5(12,"avibhav",23);
		
		a1.display();
		a2.display();
		

	}

}
