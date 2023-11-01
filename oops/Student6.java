//In this example, we are going to copy the values of one object into another using Java constructor.




package oops;

public class Student6 {
	int id;
	String name;
	Student6(int i,String n){
		id = i;
		name =n;
	}
	Student6(Student6 s){
		id = s.id;
		name = s.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s1 = new Student6(111,"Pranay");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();
		
				
		

	}

}
