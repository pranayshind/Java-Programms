package equal_demo;

import java.util.HashSet;
import java.util.Objects;

class Employee{
	int eid;
	String name;
	String dept;
	public Employee(int eid,String name,String dept) {
		
		this.eid = eid;
		this.name = name;
		this.dept= dept;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, eid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && eid == other.eid && Objects.equals(name, other.name);
	}
	
	 
}

public class employee_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee e1= new Employee(114,"John","Marketing");
		Employee e2= new Employee(108,"Rojer","HR");
		Employee e3= new Employee(101,"Mark","Development");
		Employee e4= new Employee(104,"Peter","Testing");
		Employee e5= new Employee(104,"Peter","Testing");
		
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5 
				);
		
		for(Employee e: set) {
			System.out.println(e.eid+" "+e.name+" "+e.dept);
		}


	}

}
