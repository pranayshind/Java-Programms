package oops;

/*Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.
*/
public class Student4 {
	int id;
	String name;
	Student4(int i, String n){                  //parametirzed constructor
		id = i;
		name = n;
	}
	
	void display() {                            //method to display the values  
		System.out.println(id+" "+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s1 =new Student4(10,"pranay");           //creating objects and passing values  
		Student4 s2 =new Student4(11,"nayak");
		
		s1.display();             //calling method to display the values of object  
		s2.display();
		
		

	}

}
