package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}


public class userdefinedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating user define class object
		Student s1 = new Student(101,"pranay",23);
		Student s2 = new Student(102,"ravi",24);
		Student s3 = new Student(101,"Sonu",25);
		
		//creating arraylist
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//getting iterator
		Iterator itr  = list.iterator();
		
		//traversing element of arraylist object
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			
		}

	}

}
