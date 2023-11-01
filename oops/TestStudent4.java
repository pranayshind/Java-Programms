//Initialization through method
//In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method. 
//Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.

package oops;

class Student_1{
	int id ;
	String name;
	void insertrecord(int i,String n) {
		id = i;
		name = n;	
	}
	void displayinfo() {
		System.out.println(id+" "+name);
	}
	
}

public class TestStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_1 s1 = new Student_1();
		Student_1 s2 = new Student_1();
		
		s1.insertrecord(100,"Pranay");
		s2.insertrecord(101,"vaibhav");
		
		s1.displayinfo();
		s2.displayinfo();

	}

}
