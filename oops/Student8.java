/*The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance 
variables and parameters, this keyword resolves the problem of ambiguity.

Understanding the problem without this keyword
Let's understand the problem if we don't use this keyword by the example given below:

class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
rollno=rollno;  
name=name;  
fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
Test it Now
Output:

0 null 0.0
0 null 0.0
In the above example, parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.

Solution of the above problem by this keyword*/

package oops;

public class Student8 {
	int rollno;
	String name;
	float fees;
	Student8(int rollno, String name,float fees){
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		Student8 s1 = new Student8(40,"pra",688000.00f);
		Student8 s2 = new Student8(41,"cdc",554455.54f);
		Student8 s3 = new Student8(42,"dccd",25455.51f);
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}}	
		/*If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:

			Program where this keyword is not required
			class Student{  
			int rollno;  
			String name;  
			float fee;  
			Student(int r,String n,float f){  
			rollno=r;  
			name=n;  
			fee=f;  
			}  
			void display(){System.out.println(rollno+" "+name+" "+fee);}  
			}  
			  
			class TestThis3{  
			public static void main(String args[]){  
			Student s1=new Student(111,"ankit",5000f);  
			Student s2=new Student(112,"sumit",6000f);  
			s1.display();  
			s2.display();  
			}}  
			Test it Now
			Output:

			111 ankit 5000.0
		

	}

}*/
