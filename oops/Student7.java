/*Java static variable
If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).
*/
/*Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created.
All students have its unique rollno and name, so instance data member is good in such case. Here, "college" refers to the common property of all objects.
If we make it static, this field will get the memory only once.
*/


package oops;

public class Student7 {
	int id;
	String name;
	static String college="Dbj";
	Student7(int i,String n){
		id =i;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student7 s1 = new Student7(111,"pranay");
		Student7 s2 = new Student7(111,"sujal");
		s1.display();
		s2.display();
		

	}

}
