package oops;
class Employee{
	int id;
	String name;
	float salary;

void insert(int i, String n, float s) {
	id = i;
	name = n;
	salary = s;
	
}
void display() {
	System.out.println(id+" "+name+" "+salary);
}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.insert(1,"johhn",10000);
		e2.insert(2,"Jay",20000);
	
		e1.display();
		e2.display();
		

	}

}
