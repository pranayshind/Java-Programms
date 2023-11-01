
//initializing object through reference variable

package oops;

class Student{
	int id;
	String name;
}

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		s1.id=100;
		s1.name="Pranay";
		
		System.out.println(s1.id+" "+s1.name);

	}

}
